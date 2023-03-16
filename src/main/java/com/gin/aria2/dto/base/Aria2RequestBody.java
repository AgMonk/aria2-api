package com.gin.aria2.dto.base;

import lombok.Getter;

import java.util.List;

/**
 * 请求参数
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 11:19
 */
@Getter
public class Aria2RequestBody {
    final String id;
    final String jsonrpc = "2.0";
    final String method;
    final List<Object> params;

    public Aria2RequestBody(String id, String method, List<Object> params) {
        this.id = id;
        this.method = method;
        this.params = params;
    }


}
