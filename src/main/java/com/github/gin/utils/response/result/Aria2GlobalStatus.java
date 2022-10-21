package com.github.gin.utils.response.result;

import lombok.Data;

/**
 * 概况统计
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 15:20
 */
@Data
public class Aria2GlobalStatus {
    Integer numActive;
    Integer numWaiting;
    Long downloadSpeed;
    Long uploadSpeed;
    Integer numStopped;
    Integer numStoppedTotal;
}
