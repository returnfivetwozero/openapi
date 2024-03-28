package com.champion.openapicommon.service;

import com.champion.openapicommon.model.entity.InterfaceInfo;


/**
 *
 */
public interface InnerInterfaceInfoService  {
    /**
     * 从数据库中查询模拟接口是否存在（请求路径，请求方法，请求参数,InterfaceInfo）
     * @param path
     * @param method
     * @return
     */

    InterfaceInfo getInterfaceInfo(String path,String method);
}
