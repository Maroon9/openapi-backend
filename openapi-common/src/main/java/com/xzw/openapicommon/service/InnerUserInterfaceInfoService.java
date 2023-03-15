package com.xzw.openapicommon.service;

/**
 * @author maroon
 * @date 2023/3/14 20:34
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
