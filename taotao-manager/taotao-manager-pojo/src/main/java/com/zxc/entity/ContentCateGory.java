package com.zxc.entity;

import java.util.Date;

public class ContentCateGory {
    private Integer contentCategoryId;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Byte isParent;

    private Date createTime;

    private Date lastEditTime;

    public Integer getContentCategoryId() {
        return contentCategoryId;
    }

    public void setContentCategoryId(Integer contentCategoryId) {
        this.contentCategoryId = contentCategoryId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Byte getIsParent() {
        return isParent;
    }

    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
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
}