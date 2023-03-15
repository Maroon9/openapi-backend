package com.xzw.openapicommon.service;

import com.xzw.openapicommon.model.entity.User;

/**
 * @author maroon
 * @date 2023/3/14 20:36
 * 用户服务
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

