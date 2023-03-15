package com.gin.aria2.main;

import com.gin.aria2.call.Aria2MethodCall;
import com.gin.aria2.dto.Aria2Param;
import com.gin.aria2.enums.Aria2Method;
import com.gin.aria2.response.result.Aria2Task;

import java.util.Arrays;
import java.util.List;

/**
 * api
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 15:57
 */
public class Aria2Api {
    final Aria2Client client;

    public Aria2Api(Aria2Client client) {
        this.client = client;
    }

    public Aria2MethodCall<List<Aria2Task>> tellStop(int page, int size, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellStopped, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
        return client.call(param, Aria2Task.Response.class);
    }
}   
