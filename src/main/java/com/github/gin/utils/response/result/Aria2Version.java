package com.github.gin.utils.response.result;

import lombok.Data;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 15:39
 */
@Data
public class Aria2Version {
    List<String > enabledFeatures;
    String version;
}
