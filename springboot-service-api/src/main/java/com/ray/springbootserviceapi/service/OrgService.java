package com.ray.springbootserviceapi.service;

import com.ray.springbootserviceapi.dto.OrgDTO;

/**
 * @author lixiaolei
 */
public interface OrgService {
    /**
     * 保存用户所属机构信息
     *
     * @param name
     * @return
     */
    OrgDTO saveOrg(String name);
}
