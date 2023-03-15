package com.xzw.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzw.openapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 *
 * @author maroon
 * @date 2023/3/12 16:28
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




