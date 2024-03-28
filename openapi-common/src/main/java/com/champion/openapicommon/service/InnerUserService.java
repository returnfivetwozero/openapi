package com.champion.openapicommon.service;


import com.champion.openapicommon.model.entity.User;



/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{


    /**
     * 实际情况是从数据库中查询是否已经分配给用户（ak,sk，布尔）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
