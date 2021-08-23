package com.zxc.dao;

import com.zxc.entity.ContentCateGory;

public interface ContentCateGoryMapper {
    int deleteByPrimaryKey(Integer contentCategoryId);

    int insert(ContentCateGory record);

    int insertSelective(ContentCateGory record);

    ContentCateGory selectByPrimaryKey(Integer contentCategoryId);

    int updateByPrimaryKeySelective(ContentCateGory record);

    int updateByPrimaryKey(ContentCateGory record);
}