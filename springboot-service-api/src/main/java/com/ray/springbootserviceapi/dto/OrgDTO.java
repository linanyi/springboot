/*
 * Copyright (C) 2019 	北京中文在线教育科技发展有限公司	慧读技术部
 * 
 * @Version: Version 0.1	@see <http://www.huidu.com>
 * 
 * @Date: 2019-5-9
 * 
 * @Author: Li xiaolei (lixl@chineseall.com) 
 */
package com.ray.springbootserviceapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author lixiaolei
 */
@Getter
@Setter
@ToString
public class OrgDTO implements Serializable{
    private String orgId;
    private String name;
}
