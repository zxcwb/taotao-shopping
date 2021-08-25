package com.zxc.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class Item implements Serializable {
    private Long itemId;

    private String title;

    private String sellPoint;

    private BigDecimal price;

    private Integer num;

    private String barcode;

    private String image;

    private Integer cid;

    private Integer status;

    private Date createTime;

    private Date lastEditTime;

}