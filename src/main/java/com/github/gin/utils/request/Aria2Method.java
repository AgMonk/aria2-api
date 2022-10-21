package com.github.gin.utils.request;

/**
 * 请求方法
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 10:51
 */
public enum Aria2Method {
    /**
     * 添加下载任务
     */
    addUri("aria2.addUri"),
    remove("aria2.remove"),
    tellStatus("aria2.tellStatus"),
    tellActive("aria2.tellActive"),
    tellWaiting("aria2.tellWaiting"),
    tellStopped("aria2.tellStopped"),
    getOption("aria2.getOption"),
    getGlobalStat("aria2.getGlobalStat"),
    removeDownloadResult("aria2.removeDownloadResult"),
    getVersion("aria2.getVersion"),
    multicall("system.multicall"),
    ;

    final String name;


    public String getName() {
        return name;
    }

    Aria2Method(String name) {
        this.name =  name;
    }
}
