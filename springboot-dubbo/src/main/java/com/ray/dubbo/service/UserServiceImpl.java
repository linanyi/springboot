package com.ray.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ray.springbootserviceapi.dto.UserDTO;
import com.ray.springbootserviceapi.service.UserService;

/**
 * 采用dubbo的注册服务方式
 *
 * @author lixiaolei
 */
// 多协议可以通过protocol实现，序列化等功能
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUserById(String id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("ray");
        userDTO.setAge(12);
        System.out.println("查询到了新的用户：" + userDTO);

        return userDTO;
    }
}
