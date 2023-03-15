package com.gin.aria2.response;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 16:09
 */
public class Aria2ListResponse<T> extends Aria2Response<List<T>> {
    public Aria2ListResponse(String id, String jsonrpc, List<T> result) {
        super(id, jsonrpc, result);
    }
}
