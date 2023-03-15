package com.gin.aria2.main;

import com.gin.aria2.call.Aria2MethodCall;
import com.gin.aria2.dto.Aria2Param;
import com.gin.aria2.enums.Aria2Method;
import com.gin.aria2.response.Aria2StringResponse;
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

    /**
     * 移除下载完成的任务
     * @param gid gid
     * @return gid
     */
    public Aria2MethodCall<String> remove(String gid) {
        final Aria2Param param = new Aria2Param(Aria2Method.remove, gid);
        return client.call(param, Aria2StringResponse.class);
    }

    /**
     * 移除下载完成的任务
     * @param gid gid
     * @return gid
     */
    public Aria2MethodCall<String> removeDownloadResult(String gid) {
        final Aria2Param param = new Aria2Param(Aria2Method.removeDownloadResult, gid);
        return client.call(param, Aria2StringResponse.class);
    }

    /**
     * 查询活动任务
     * @param keys 字段
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellActive(String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellActive, Arrays.asList(keys));
        return client.call(param, Aria2Task.ListResponse.class);
    }

    /**
     * 查询单个任务状态
     * @param gid  gid
     * @param keys 字段
     * @return 任务状态
     */
    public Aria2MethodCall<Aria2Task> tellStatus(String gid, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellStatus, Arrays.asList(gid, Arrays.asList(keys)));
        return client.call(param, Aria2Task.Response.class);
    }

    /**
     * 查询停止任务
     * @param page 页数
     * @param size 每页条数
     * @param keys 字段
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellStop(int page, int size, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellStopped, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
        return client.call(param, Aria2Task.ListResponse.class);
    }

    /**
     * 查询等待任务
     * @param page 页数
     * @param size 每页条数
     * @param keys 字段
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellWaiting(int page, int size, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellWaiting, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
        return client.call(param, Aria2Task.ListResponse.class);
    }


}   
