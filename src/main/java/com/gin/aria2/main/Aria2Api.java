package com.gin.aria2.main;

import com.gin.aria2.dto.Aria2Param;
import com.gin.aria2.enums.Aria2Method;

import java.util.Arrays;

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

    public Aria2Call tellStop(int page, int size, String... keys){
        return client.call(new Aria2Param(Aria2Method.tellStopped, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys))));
    }
}   
