package com.github.gin.utils.params.methods;

import com.github.gin.utils.request.Aria2Method;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 15:51
 */
@Data
@AllArgsConstructor
public class MulticallParam {
    final String methodName;
    final List<?> params;

    public MulticallParam(Aria2Method aria2Method, List<?> params) {
        this.methodName = aria2Method.getName();
        this.params = params;
    }
}
