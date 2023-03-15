package com.gin.aria2.call;

import com.gin.aria2.callback.AbstractAria2Callback;
import com.gin.aria2.exception.Aria2RequestException;
import okhttp3.Call;
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
     * 异步请求
     * @param callback 回调方法
     */
    public void asyncString(AbstractAria2Callback callback) {
        this.call.enqueue(callback);
    }

    /**
     * 同步请求
     * @return 字符串
     */
    public String syncString() throws IOException, Aria2RequestException {
        try (Response response = this.call.execute()) {
            ResponseBody body = AbstractAria2Callback.body(this.call, response);
            return body != null ? body.string() : null;
        }
    }
}
