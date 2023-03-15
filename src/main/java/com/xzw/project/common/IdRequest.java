package com.xzw.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author maroon
 * @date 2023/3/8 17:51
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
