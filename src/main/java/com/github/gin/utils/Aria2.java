package com.github.gin.utils;

import com.github.gin.utils.params.Aria2Option;
import com.github.gin.utils.params.Aria2Param;
import com.github.gin.utils.params.methods.AddUriParam;
import com.github.gin.utils.request.Aria2Methods;
import com.github.gin.utils.request.Aria2Request;
import com.github.gin.utils.request.LoggingInterceptor;
import com.github.gin.utils.response.Aria2Response;
import com.github.gin.utils.response.Task;
import okhttp3.OkHttpClient;
import org.gin.JsonUtils;

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

    /**
     * 原生请求方法
     * @param method 方法名
     * @param params 参数
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < T>>
     * @since 2022/10/21 14:33
     */
    public <T> Aria2Request<Aria2Response<T>> call(String method, List<Object> params) {
        if (token != null && !"".equals(token)) {
            params.add(0, "token:" + token);
        }
        final Aria2Param param = new Aria2Param(String.valueOf(this.id++), method, params);
        JsonUtils.printJson(param);
        return new Aria2Request<>(this.client, this.host, param);
    }

    /**
     * 移除正在下载的任务
     * @param gid gid
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < java.lang.String>>
     * @since 2022/10/21 14:18
     */
    public Aria2Request<Aria2Response<String>> remove(String gid) {
        return call(Aria2Methods.remove, gid);
    }

    public Aria2Request<Aria2Response<Aria2Option>> getOption(String gid) {
        return call(Aria2Methods.getOption, gid);
    }



    /**
     * 查询活动任务
     * @param keys keys
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < java.util.List < com.github.gin.utils.response.Task>>>
     * @since 2022/10/21 14:57
     */
    public Aria2Request<Aria2Response<List<Task>>> tellActive(String... keys) {
        return call(Aria2Methods.tellActive, Arrays.asList(keys));
    }

    /**
     * 查询任务状态
     * @param gid  gid
     * @param keys keys
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < com.github.gin.utils.response.Task>>
     * @since 2022/10/21 14:32
     */
    public Aria2Request<Aria2Response<Task>> tellStatus(String gid, String... keys) {
        return call(Aria2Methods.tellStatus, Arrays.asList(gid, Arrays.asList(keys)));
    }

    /**
     * 查询已停止任务
     * @param page 页码
     * @param size 记录数
     * @param keys https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < java.util.List < com.github.gin.utils.response.Task>>>
     * @since 2022/10/21 14:10
     */
    public Aria2Request<Aria2Response<List<Task>>> tellStop(int page, int size, String... keys) {
        return call(Aria2Methods.tellStopped, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
    }

    /**
     * 查询等待的任务
     * @param page 页码
     * @param size 记录数
     * @param keys https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus
     * @return com.github.gin.utils.request.Aria2Request<com.github.gin.utils.response.Aria2Response < java.util.List < com.github.gin.utils.response.Task>>>
     * @since 2022/10/21 15:01
     */
    public Aria2Request<Aria2Response<List<Task>>> tellWaiting(int page, int size, String... keys) {
        return call(Aria2Methods.tellWaiting, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
    }


}
