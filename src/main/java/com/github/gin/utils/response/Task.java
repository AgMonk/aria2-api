package com.github.gin.utils.response;

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
public class Task {
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
    List<TaskFile> files;
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
        final Task task = new Task();
        final String s = JSONObject.toJSONString(task, SerializerFeature.WriteMapNullValue);
        final JSONObject json = JSONObject.parseObject(s);
        return json.keySet();
    }
}
