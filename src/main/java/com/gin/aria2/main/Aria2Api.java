package com.gin.aria2.main;

import com.gin.aria2.call.Aria2MethodCall;
import com.gin.aria2.dto.Aria2Param;
import com.gin.aria2.enums.Aria2Method;
import com.gin.aria2.params.Aria2Option;
import com.gin.aria2.params.methods.AddUriParam;
import com.gin.aria2.response.Aria2StringResponse;
import com.gin.aria2.response.result.Aria2GlobalStatus;
import com.gin.aria2.response.result.Aria2Task;
import com.gin.aria2.response.result.Aria2Version;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * api <a href="https://aria2.github.io/manual/en/html/aria2c.html">API文档</a>
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
     * 添加单个任务
     * @param urls   下载地址
     * @param params 参数
     */
    public Aria2MethodCall<String> addUri(Collection<String> urls, AddUriParam params) {
        final Aria2Param param = new Aria2Param(Aria2Method.addUri, urls, params);
        return client.call(param, Aria2StringResponse.class);
    }

    /**
     * 获取概况统计
     * @return 概况统计
     */
    public Aria2MethodCall<Aria2GlobalStatus> getGlobalStat() {
        final Aria2Param param = new Aria2Param(Aria2Method.getGlobalStat);
        return client.call(param, Aria2GlobalStatus.Response.class);
    }

    /**
     * 获取下载参数
     * @param gid gid
     * @return 下载参数
     */
    public Aria2MethodCall<Aria2Option> getOption(String gid) {
        final Aria2Param param = new Aria2Param(Aria2Method.getOption, gid);
        return client.call(param, Aria2Option.Response.class);

    }

    /**
     * 获取版本信息
     * @return 版本信息
     */
    public Aria2MethodCall<Aria2Version> getVersion() {
        final Aria2Param param = new Aria2Param(Aria2Method.getVersion);
        return client.call(param, Aria2Version.Response.class);
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
     * @param keys  <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellActive(String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellActive, Arrays.asList(keys));
        return client.call(param, Aria2Task.ListResponse.class);
    }

    /**
     * 查询单个任务状态
     * @param gid  gid
     * @param keys  <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
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
     * @param keys  <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
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
     * @param keys  <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellWaiting(int page, int size, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellWaiting, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
        return client.call(param, Aria2Task.ListResponse.class);
    }
    //todo 批量添加下载任务
    //todo 批量移除下载完成的任务

}   
