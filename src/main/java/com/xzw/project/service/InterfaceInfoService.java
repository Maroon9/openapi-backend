package com.xzw.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzw.openapicommon.model.entity.InterfaceInfo;

/**
 * @author maroon
 * @date 2023/3/7 16:28
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
