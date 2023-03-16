package com.gin.aria2.response.result;

import com.gin.aria2.enums.TaskStatus;
import com.gin.aria2.response.Aria2ListResponse;
import com.gin.aria2.response.Aria2Response;
import com.gin.aria2.response.field.Aria2TaskFile;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 任务状态
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 12:36
 */
@Getter
@Setter
public class Aria2TaskStatus {
    String gid;
    TaskStatus status;
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
    Integer errorCode;
    String errorMessage;


    //以下为未确定数据类型的字段

    String infoHash;
    String numSeeders;
    String seeder;
    String followedBy;
    String following;
    String belongsTo;
    Object bittorrent;
    String verifiedLength;
    String verifyIntegrityPending;

    public static class ListResponse extends Aria2ListResponse<Aria2TaskStatus> {
    }

    public static class Response extends Aria2Response<Aria2TaskStatus> {
    }
}
