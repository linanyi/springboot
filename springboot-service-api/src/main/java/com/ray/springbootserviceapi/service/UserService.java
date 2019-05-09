package com.ray.springbootserviceapi.service;

import com.ray.springbootserviceapi.dto.UserDTO;

/**
 * @author lixiaolei
 */
public interface UserService {
    /**
     * 根据用户ID查询用户信息
     *
     * @param id
     * @return
     */
    UserDTO getUserById(String id);
}
