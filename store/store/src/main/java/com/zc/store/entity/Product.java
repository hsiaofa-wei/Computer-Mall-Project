package com.zc.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 商品实体类
 */
@Data
@EqualsAndHashCode
@ToString
public class Product extends BaseEntity { //商品类
    private Integer id;//商品id
    private Integer categoryId;//商品分类id
    private String itemType;//商品系列
    private String title;//商品标题
    private String sellPoint;//商品卖点
    private Long price;//商品单价
    private Integer num;//商品库存数量
    private String image;//图片（路径）
    private Integer status;//商品状态  1：上架  2：下架  3：删除
    private Integer priority;//显示优先级
}
