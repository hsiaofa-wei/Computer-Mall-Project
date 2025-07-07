package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 用户实体类
 */
@Data
@EqualsAndHashCode
@ToString
public class User extends BaseEntity{//用户实体类
    private Integer uid;//用户id
    private String username;//用户名称
    private String password;//用户密码
    private String salt;//用户盐值
    private String phone;//用户手机号
    private String email;//用户邮箱
    private Integer gender;//用户性别0代表女1代表男
    private String avatar;//头像
    private Integer isDelete;//用户是否被删除，删除为1，未删除为0
}
