package com.github.gin.utils.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * 转换器
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/14 16:00
 **/
public interface Convertor<R> {

    /**
     * 通用转换器
     * @param responseBody ResponseBody
     * @param clazz        body类型
     * @return org.gin.response.Aria2Response<T>
     * @throws IOException 异常
     * @since 2022/10/15 11:01
     */
    static <T> Aria2Response<T> common(ResponseBody responseBody, Class<T> clazz) throws IOException {
        String string = responseBody.string();
        System.out.println("string = " + string);
        final Aria2Response<String> response = JSONObject.parseObject(string, new TypeReference<Aria2Response<String>>() {
        });
        if (clazz == String.class) {
            //noinspection unchecked
            return (Aria2Response<T>) response;
        }
        final T t = JSONObject.parseObject(response.getResult(), clazz);
        return new Aria2Response<>(response.getId(), response.getJsonrpc(), t);
    }


    /**
     * 从 ResponseBody 转换到R的方法
     * @param responseBody ResponseBody
     * @return R
     * @throws IOException 异常
     */
    R convert(ResponseBody responseBody) throws IOException;
}
