package com.gin.aria2.request;

import com.alibaba.fastjson.JSONObject;
import com.gin.aria2.exception.Aria2RequestException;
import com.gin.aria2.params.Aria2Param;
import com.gin.aria2.response.BaseCallback;
import com.gin.aria2.response.Convertor;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * 请求
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 11:17
 */
public class Aria2Request<R> {
    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

    final Request request;
    final OkHttpClient client;


    public Aria2Request(@NotNull OkHttpClient client,@NotNull String host, Aria2Param param) {
        final RequestBody requestBody = RequestBody.create(JSONObject.toJSONString(param), MEDIA_TYPE_JSON);
        this.request = new Request.Builder().url(host).post(requestBody).build();
        this.client = client;
    }

    /**
     * 异步请求
     * @param callback 响应处理
     */
    public void async(Callback callback) {
        client.newCall(request).enqueue(callback);
    }

    /**
     * 异步请求
     * @param baseCallback 响应处理
     */
    public void async(BaseCallback<R> baseCallback) {
        async((Callback) baseCallback);
    }

    /**
     * 同步请求
     * @return ResponseBody
     * @throws IOException    异常
     */
    public ResponseBody sync() throws IOException, Aria2RequestException {
        final Call call = client.newCall(request);
        final Response response = call.execute();
        return BaseCallback.handle(call, response);
    }

    /**
     * 同步请求
     * @return R
     * @throws IOException    异常
     */
    public R sync(Convertor<R> convertor) throws IOException, Aria2RequestException {
        return convertor.convert(sync());
    }
}
