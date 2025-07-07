package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 订单项实体类
 */
@Data
@ToString
@EqualsAndHashCode
public class OrderItem extends BaseEntity{
    private Integer id;//订单中的商品记录的id
    private Integer oid;//所归属的订单id
    private Integer pid;//商品的id
    private String title;//商品标题
    private String image;//商品图片
    private Long price;//商品价格
    private Integer num;//购买数量
}
