package com.xzw.project.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author maroon
 * @date 2023/3/7 16:28
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}