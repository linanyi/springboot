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
public class UserDTO implements Serializable {
    private String id;
    private String name;
    private Integer age;
}
