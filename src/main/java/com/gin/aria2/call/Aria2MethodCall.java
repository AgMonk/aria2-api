package com.gin.aria2.call;

import com.gin.aria2.callback.AbstractAria2Callback;
import com.gin.aria2.callback.ClassAria2Callback;
import com.gin.aria2.exception.Aria2RequestException;
import com.gin.aria2.response.Aria2Response;
import com.gin.aria2.utils.JsonUtils;
import okhttp3.Call;

import java.io.IOException;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 16:28
 */
public class Aria2MethodCall<T> extends Aria2Call {
    final Class<?extends Aria2Response<T>> responseClass;

    public Aria2MethodCall(Call call, Class<?extends Aria2Response<T>> responseClass) {
        super(call);
        this.responseClass = responseClass;
    }
    public void async(ClassAria2Callback<T> callback) {
        this.async((AbstractAria2Callback) callback);
    }
    /**
     * 同步请求
     * @return 响应
     */
    public T sync() throws IOException, Aria2RequestException {
        final String s = this.syncString();
        if (s == null) {
            return null;
        }
        final Aria2Response<T> res = JsonUtils.parse(s, responseClass);
        return res == null ? null : res.getResult();
    }
}   
