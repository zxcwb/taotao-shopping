package com.zxc.entity;

import java.util.Date;

public class ItemParamItem {
    private Integer itemParamItemId;

    private Integer itemId;

    private Date createTime;

    private Date lastEditTime;

    private String paramData;

    public Integer getItemParamItemId() {
        return itemParamItemId;
    }

    public void setItemParamItemId(Integer itemParamItemId) {
        this.itemParamItemId = itemParamItemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
}