package com.github.gin.utils.response;

import com.github.gin.utils.exception.Aria2Exception;
import com.github.gin.utils.exception.Aria2RequestException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/14 15:47
 **/
public interface BaseCallback<R> extends Callback, Convertor<R> {
    /**
     * 处理响应
     * @param call     call
     * @param response 响应
     * @return body
     * @throws Aria2RequestException 异常
     */
    static ResponseBody handle(@NotNull Call call, @NotNull Response response) throws Aria2RequestException {
        final int code = response.code();
        final int co = code / 100;
        switch (co) {
            case 3:
            case 2:
                return response.body();
            case 4:
                throw new Aria2RequestException(code,response.message(), call);
            case 5:
                throw new Aria2RequestException(code, "服务器异常",call);
            default:
                throw new Aria2RequestException(code, "非预期的code",call);
        }
    }

    /**
     * 触发Pixiv异常时的处理方法
     * @param e 异常
     */
    void onPixivException(Aria2Exception e);

    /**
     * 请求成功时的处理方法
     * @param res 返回对象
     */
    void onSuccess(R res);

    /**
     * 失败时的处理方法
     * @param call callback
     * @param e    异常
     */
    @Override
    default void onFailure(@NotNull Call call, @NotNull IOException e) {
        e.printStackTrace();
    }

    /**
     * 请求成功时的处理方法
     * @param call     call
     * @param response 响应
     * @throws IOException 异常
     */
    @Override
    default void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        try {
            final ResponseBody responseBody = handle(call, response);
            final R res = convert(responseBody);
            onSuccess(res);
        } catch (Aria2Exception e) {
            onPixivException(e);
        }
    }
}
