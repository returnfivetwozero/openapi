package com.champion.openapicommon.service;

import com.champion.openapicommon.model.entity.InterfaceInfo;



/**
* @author champion
* @description 针对表【user_interface_info(用户调用次数关系)】的数据库操作Service
* @createDate 2024-01-27 10:53:45
*/
public interface InnerUserInterfaceInfoService {
    /**
     * 调用接口次数+1
     * @param interfaceId
     * @param userId
     * @return
     */
    boolean invokeCount(Long interfaceId,Long userId);

    /**
     * 查询当前用户使用该接口剩余的次数
     * @param interfaceId
     * @param userId
     * @return
     */
    int getLeftNums(Long interfaceId,Long userId);
}
