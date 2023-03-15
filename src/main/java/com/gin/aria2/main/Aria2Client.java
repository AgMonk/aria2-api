package com.gin.aria2.main;

import com.gin.aria2.dto.Aria2Param;
import com.gin.aria2.dto.form.Aria2RequestBody;
import com.gin.aria2.enums.Aria2Method;
import com.gin.aria2.request.LoggingInterceptor;
import com.gin.aria2.utils.JsonUtils;
import com.gin.aria2.utils.ObjUtils;
import okhttp3.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Aria2客户端
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 13:57
 */
public class Aria2Client {
    public static final String DEFAULT_HOST = "http://localhost:6800/jsonrpc";
    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");
    final String host;
    final OkHttpClient client;
    final String token;
    int id = 0;

    public Aria2Client(OkHttpClient client, String host, String token) {
        this.host = ObjUtils.isEmpty(host) ? DEFAULT_HOST : host;
        this.client = client != null ? client : new OkHttpClient().newBuilder().addInterceptor(new LoggingInterceptor()).build();
        this.token = token;
    }

    public Aria2Client() {
        this(null, null, null);
    }

    /**
     * 生成请求
     * @param param 参数
     * @return Call
     */
    public Aria2Call call(Aria2Param param) {
        final List<Object> params = param.getParams();
        if (!ObjUtils.isEmpty(this.token)) {
            params.add(0, "token:" + token);
        }
        final Aria2RequestBody aria2RequestBody = new Aria2RequestBody(String.valueOf(this.id++), param.getMethodName().getName(), params);
        final RequestBody requestBody = RequestBody.create(JsonUtils.obj2Str(aria2RequestBody), MEDIA_TYPE_JSON);
        final Request request = new Request.Builder().url(host).post(requestBody).build();
        return new Aria2Call(this.client.newCall(request));
    }

    /**
     * 一次发送多个请求
     * @param params 参数
     * @return Call
     */
    public Aria2Call call(List<Aria2Param> params) {
        return call(new Aria2Param(Aria2Method.multicall, new ArrayList<>(params)));
    }
}
