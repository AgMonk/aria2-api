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
     String id;
     String jsonrpc;
     T result;
}
