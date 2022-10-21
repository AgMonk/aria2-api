package com.github.gin.utils;

import com.github.gin.utils.params.Aria2Param;
import com.github.gin.utils.params.methods.AddUriParam;
import com.github.gin.utils.request.Aria2Methods;
import com.github.gin.utils.request.Aria2Request;
import com.github.gin.utils.request.LoggingInterceptor;
import com.github.gin.utils.response.Aria2Response;
import okhttp3.OkHttpClient;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 主类
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 11:03
 */
public class Aria2 {
    public static final String DEFAULT_HOST = "http://localhost:6800/jsonrpc";
    final String host;
    final OkHttpClient client;
    final String token;
    int id = 0;


    public Aria2(OkHttpClient client) {
        this(DEFAULT_HOST, client);
    }

    public Aria2() {
        this(DEFAULT_HOST);
    }

    public Aria2(String host) {
        this(host, buildClient());
    }

    public Aria2(String host, OkHttpClient client) {
        this(host, client, null);
    }

    public Aria2(String host, OkHttpClient client, String token) {
        this.host = host;
        this.client = client;
        this.token = token;
    }

    private static OkHttpClient buildClient() {
        return new OkHttpClient.Builder()
                .callTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new LoggingInterceptor())
                .build();
    }

    public Aria2Request<Aria2Response<String>> addUri(Collection<String> urls, AddUriParam params) {
        return call(Aria2Methods.addUri, urls, params);
    }

    public <T> Aria2Request<Aria2Response<T>> call(String method, Object... params) {
        return call(method, Arrays.asList(params));
    }

    public <T> Aria2Request<Aria2Response<T>> call(Aria2Methods method, List<Object> params) {
        return call(method.getName(), params);
    }

    public <T> Aria2Request<Aria2Response<T>> call(Aria2Methods method, Object... params) {
        return call(method.getName(), params);
    }

    public <T> Aria2Request<Aria2Response<T>> call(String method, List<Object> params) {
        if (token != null && !"".equals(token)) {
            params.add(0, "token:" + token);
        }
        return new Aria2Request<>(this.client, this.host, new Aria2Param(String.valueOf(this.id++), method, params));
    }
}
