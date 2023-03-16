package com.gin.aria2.main;

import com.gin.aria2.call.Aria2MethodCall;
import com.gin.aria2.dto.base.Aria2Option;
import com.gin.aria2.dto.base.Aria2Param;
import com.gin.aria2.dto.form.Aria2AddUriForm;
import com.gin.aria2.enums.Aria2Method;
import com.gin.aria2.response.Aria2StringResponse;
import com.gin.aria2.response.result.Aria2GlobalStatus;
import com.gin.aria2.response.result.Aria2Task;
import com.gin.aria2.response.result.Aria2Version;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * api <a href="https://aria2.github.io/manual/en/html/aria2c.html">API文档</a>
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 15:57
 */
@Getter
public class Aria2Api {
    final Aria2Client client;

    public Aria2Api(Aria2Client client) {
        this.client = client;
    }

    /**
     * 添加单个任务
     * @param form  表单
     */
    public Aria2MethodCall<String> addUri(Aria2AddUriForm form) {
        return client.call(form.buildParam(), Aria2StringResponse.class);
    }

    /**
     * 批量添加任务
     * @param forms 表单
     * @return gid
     */
    public Aria2MethodCall<List<List<String>>> addUris(Collection<Aria2AddUriForm> forms) {
        final List<Aria2Param> params = forms.stream().map(Aria2AddUriForm::buildParam).collect(Collectors.toList());
        return client.call(params, Aria2AddUriForm.Response.class);
    }

    /**
     * 批量添加任务，每个url为一个任务，使用相同下载参数
     * @param urls   urls
     * @param params 下载参数
     * @return gid
     */
    public Aria2MethodCall<List<List<String>>> addUris(Collection<String> urls, Aria2Option params) {
        return addUris(urls.stream()
                               .map(url -> new Aria2AddUriForm(Collections.singleton(url), params.clone()))
                               .collect(Collectors.toList())
        );
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
     * @param keys <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellActive(String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellActive, Arrays.asList(keys));
        return client.call(param, Aria2Task.ListResponse.class);
    }

    /**
     * 查询单个任务状态
     * @param gid  gid
     * @param keys <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
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
     * @param keys <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
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
     * @param keys <a href="https://aria2.github.io/manual/en/html/aria2c.html#aria2.tellStatus">字段</a>
     * @return 任务状态
     */
    public Aria2MethodCall<List<Aria2Task>> tellWaiting(int page, int size, String... keys) {
        final Aria2Param param = new Aria2Param(Aria2Method.tellWaiting, Arrays.asList(Math.max(0, (page - 1) * size), size, Arrays.asList(keys)));
        return client.call(param, Aria2Task.ListResponse.class);
    }
    //todo 批量添加下载任务
    //todo 批量移除下载完成的任务

}   
