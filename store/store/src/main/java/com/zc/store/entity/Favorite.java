package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@EqualsAndHashCode
@ToString
public class Favorite {//最喜欢的商品

    private Integer fid;//收藏数据的id
    private Integer uid;//用户id
    private Integer pid;//商品id
    private Long price;//收藏时的单价
    private String title;//商品名
    private String image;//图片（地址）
    private String createUser;//收藏用户
    private Date createTime;//创建（收藏时间）
}
