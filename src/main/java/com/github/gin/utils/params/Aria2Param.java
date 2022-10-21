package com.github.gin.utils.params;

import lombok.Getter;

import java.util.List;

/**
 * 请求参数
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 11:19
 */
@Getter
public class Aria2Param {
    final String id;
    final String jsonrpc = "2.0";
    final String method;
    final List<?> params;

    public Aria2Param(String id, String method, List<?> params) {
        this.id = id;
        this.method = method;
        this.params = params;
    }


}
