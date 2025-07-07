package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@EqualsAndHashCode
public class District implements Serializable {//实现Serializable接口是该类可以被序列化

    private Integer id;
    //父区域代号
    private String parent;
    //本身代号
    private String code;
    //区域名称
    private String name;
}
