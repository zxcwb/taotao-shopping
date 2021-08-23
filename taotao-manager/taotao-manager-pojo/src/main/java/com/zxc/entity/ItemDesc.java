package com.zxc.entity;

import java.util.Date;

public class ItemDesc {
    private Integer itemDescId;

    private Date createTime;

    private Date lastEditTime;

    private String itemDesc;

    public Integer getItemDescId() {
        return itemDescId;
    }

    public void setItemDescId(Integer itemDescId) {
        this.itemDescId = itemDescId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}