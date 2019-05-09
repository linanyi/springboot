package com.ray.springbootdubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ray.springbootserviceapi.dto.OrgDTO;
import com.ray.springbootserviceapi.dto.UserDTO;
import com.ray.springbootserviceapi.service.OrgService;
import com.ray.springbootserviceapi.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 引用dubbo服务的示例
 *
 * @author lixiaolei
 */
@Service
public class DubboService {
    @Reference(version = "1.0.0")
    UserService userService;

    // check=false，启动时会自动检查，如果有两个服务相互依赖，则可以关闭自动检查，启动
    // cluster , 容错策略
    // 容错取值范围：Failover 默认，失败后自动切换，当出现失败后，自动切换其它服务器，可以设置重试次数
    // Failfast:快速失败，失败后就立马报错
    // Failback:失败后自动恢复
    // Forking: 同时并行调用几个相同的服务，只要一个成功即返回，可以设置最大并行数
    // Broadcast:广播调用所有提供者，挨个调用，只要有一个报错就报错
    // Failsafe:安全失败，发生异常，直接忽略
    // 服务降级，可以通过设置：timeout，启用降级，降级基本上就是超过500毫秒（下述设置），就停用服务。如果Failsafe降级是不起作用的
    @Reference(version = "1.1.0", timeout = 500)
    UserService userServiceV2;

    @Reference
    OrgService orgService;

    public UserDTO getUserById(String userId) {
        return userService.getUserById(userId);
    }

    public UserDTO getUserByIdV2(String userId) {
        return userServiceV2.getUserById(userId);
    }

    public OrgDTO saveOrg(String orgName) {
        return orgService.saveOrg(orgName);
    }
}
