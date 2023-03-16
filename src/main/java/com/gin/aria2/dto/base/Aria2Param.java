package com.gin.aria2.dto.base;

import com.gin.aria2.enums.Aria2Method;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * 请求参数
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2023/3/15 14:45
 */
@Getter
public class Aria2Param {
    @NotNull
    final Aria2Method methodName;
    @NotNull
    final List<Object> params;

    public Aria2Param(@NotNull Aria2Method methodName, @NotNull List<Object> params) {
        this.methodName = methodName;
        this.params = params;
    }
    public Aria2Param(@NotNull Aria2Method methodName, Object... params) {
        this.methodName = methodName;
        this.params = Arrays.asList(params);
    }

}
