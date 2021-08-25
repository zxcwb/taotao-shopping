package com.zxc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class ItemCat implements Serializable {
    private Long itemCatId;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date createTime;

    private Date lastEditTime;
}