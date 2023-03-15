package com.xzw.openapicommon.service;

import com.xzw.openapicommon.model.entity.InterfaceInfo;

/**
 * @author maroon
 * @date 2023/3/14 20:34
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
