package com.ray.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ray.springbootserviceapi.dto.UserDTO;
import com.ray.springbootserviceapi.service.UserService;

/**
 * 用户服务接口1.1.0，升级版本
 * @author lixiaolei
 */
@Service(version = "1.1.0")
public class UserServiceV2Impl implements UserService{

    @Override
    public UserDTO getUserById(String id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("huhuan");
        userDTO.setAge(13);
        System.out.println("查询到了新的用户：" + userDTO);

        return userDTO;
    }
}
