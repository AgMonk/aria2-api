package com.gin.aria2.response.result;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 下载任务
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 12:36
 */
@Data
public class Aria2Task {
    String gid;
    String status;
    Long totalLength;
    Long completedLength;
    Long uploadLength;
    Long pieceLength;
    Integer numPieces;
    Integer connections;
    String bitfield;
    String dir;
    List<Aria2TaskFile> files;
    Long downloadSpeed;
    Long uploadSpeed;


    //以下为未确定数据类型的字段

    String infoHash;
    String numSeeders;
    String seeder;
    String errorCode;
    String errorMessage;
    String followedBy;
    String following;
    String belongsTo;
    Object bittorrent;
    String verifiedLength;
    String verifyIntegrityPending;


    public static Set<String> keys() {
        final Aria2Task aria2Task = new Aria2Task();
        final String s = JSONObject.toJSONString(aria2Task, SerializerFeature.WriteMapNullValue);
        final JSONObject json = JSONObject.parseObject(s);
        return json.keySet();
    }
}
