package com.gin.aria2.params.methods;

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
    /**
     * 保存目录
     */
    String dir;
    /**
     * 文件名
     */
    @JSONField(name = "out")
    String filename;
    String referer;
    /**
     * 断点续传
     */
}
