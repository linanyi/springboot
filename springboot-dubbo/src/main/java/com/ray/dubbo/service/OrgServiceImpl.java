package com.ray.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ray.springbootserviceapi.dto.OrgDTO;
import com.ray.springbootserviceapi.service.OrgService;

import java.util.UUID;

/**
 * @author lixiaolei
 */
@Service
public class OrgServiceImpl implements OrgService {

    @Override
    public OrgDTO saveOrg(String name) {
        OrgDTO orgDTO = new OrgDTO();
        orgDTO.setOrgId(UUID.randomUUID().toString());
        orgDTO.setName(name);
        System.out.println("保存了新的机构信息：" + orgDTO);

        return orgDTO;
    }
}
