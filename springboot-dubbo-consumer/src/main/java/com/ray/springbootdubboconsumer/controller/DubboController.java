package com.ray.springbootdubboconsumer.controller;

import com.ray.springbootdubboconsumer.service.DubboService;
import com.ray.springbootserviceapi.dto.OrgDTO;
import com.ray.springbootserviceapi.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaolei
 */
@RestController
public class DubboController {
    @Autowired
    DubboService service;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserDTO getUserById(@PathVariable("id") String id, @RequestParam(name = "v", defaultValue = "1.0.0") String version) {
        if ("1.0.0".equalsIgnoreCase(version)) {
            return service.getUserById(id);
        } else {
            return service.getUserByIdV2(id);
        }
    }

    @RequestMapping(value = "org", method = RequestMethod.POST)
    public OrgDTO saveOrg(@RequestParam(name = "name") String name) {
        if (StringUtils.isEmpty(name)) {
            System.out.println("机构名字不能为空");
            return new OrgDTO();
        }

        return service.saveOrg(name);
    }
}
