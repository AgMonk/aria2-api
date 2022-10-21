package com.github.gin.utils.params.methods;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/10/21 12:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUriParam {
    String dir;
    @JSONField(name = "out")
    String filename;
    String referer;
}
