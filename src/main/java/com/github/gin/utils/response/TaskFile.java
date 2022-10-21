package com.github.gin.utils.response;

import lombok.Data;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 14:40
 */
@Data
public class TaskFile {
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