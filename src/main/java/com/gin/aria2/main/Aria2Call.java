package com.gin.aria2.main;

import com.gin.aria2.callback.AbstractAria2Callback;
import com.gin.aria2.exception.Aria2RequestException;
import com.gin.aria2.response.Aria2Response;
import com.gin.aria2.utils.JsonUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 15:32
 */
public class Aria2Call {
    final Call call;

    public Aria2Call(Call call) {
        this.call = call;
    }

    /**
     * 异步请求(原生)
     * @param callback 回调方法
     */
    public void async(Callback callback) {
        this.call.enqueue(callback);
    }

    /**
     * 异步请求(推荐)
     * @param callback 回调方法
     */
    public void async(AbstractAria2Callback callback) {
        async((Callback) callback);
    }

    /**
     * 同步请求,返回指定类型
     * @param clazz 返回值类对象
     * @return T
     */
    public <T> T sync(Class<Aria2Response<T>> clazz) throws IOException, Aria2RequestException {
        final Aria2Response<T> response = JsonUtils.parse(sync(), clazz);
        return response == null ? null : response.getResult();
    }

    /**
     * 同步请求
     * @return 响应
     */
    public String sync() throws IOException, Aria2RequestException {
        final Response response = this.call.execute();
        try (ResponseBody body = AbstractAria2Callback.body(this.call, response)) {
            return body != null ? body.string() : null;
        }
    }
}
