package com.miaoshaproject.controller.viewobject;


import java.math.BigDecimal;

public class ItemVO {

    private Integer id;

    //商品名字
    private String title;

    //商品的价格
    private BigDecimal price;

    //商品的库存
    private Integer stock;

    //商品描述
    private String description;

    //销量
    private Integer sales;

    //商品描述图片的url
    private String imgUrl;
}
