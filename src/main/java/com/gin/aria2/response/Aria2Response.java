package com.gin.aria2.response;

import lombok.Getter;

/**
 * 请求参数
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 11:19
 */
@Getter
public class Aria2Response<T> {
    final String id;
    final String jsonrpc;
    final T result;

    public Aria2Response(String id, String jsonrpc, T result) {
        this.id = id;
        this.jsonrpc = jsonrpc;
        this.result = result;
    }
}
