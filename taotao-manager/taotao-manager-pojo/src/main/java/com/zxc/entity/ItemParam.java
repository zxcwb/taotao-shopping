package com.zxc.entity;

import java.util.Date;

public class ItemParam {
    private Integer itemParamId;

    private Integer itemCatId;

    private Date createTime;

    private Date lastEditTime;

    private String paramData;

    public Integer getItemParamId() {
        return itemParamId;
    }

    public void setItemParamId(Integer itemParamId) {
        this.itemParamId = itemParamId;
    }

    public Integer getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Integer itemCatId) {
        this.itemCatId = itemCatId;
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