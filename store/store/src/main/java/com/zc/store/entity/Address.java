package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 收货地址实体类
 */
@Data
@EqualsAndHashCode
@ToString
public class Address extends BaseEntity{

    private Integer aid;//收获地址id
    private Integer uid;//用户id
    private String name;//用户姓名
    private String provinceName;//省名称
    private String provinceCode;//省行政代码
    private String cityName;//市名称
    private String cityCode;//市行政代码
    private String areaName;//区名称
    private String areaCode;//区行政代码
    private String zip;//邮政编码
    private String address;//详细地址
    private String phone;//手机
    private String tel;//固话
    private String tag;//标签
    private Integer isDefault;//地址是否默认：0-不默认，1-默认
}
