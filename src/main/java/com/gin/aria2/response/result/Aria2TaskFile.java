package com.gin.aria2.response.result;

import lombok.Data;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 14:40
 */
@Data
public class Aria2TaskFile {
    String path;
    Long completedLength;
    Long length;
    Integer index;
    Boolean selected;
    List<Uri> uris;

    @Data
    public static class Uri {
        String uri;
        String status;
    }
}