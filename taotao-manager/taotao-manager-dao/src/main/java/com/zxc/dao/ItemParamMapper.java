package com.zxc.dao;

import com.zxc.entity.ItemParam;

public interface ItemParamMapper {
    int deleteByPrimaryKey(Integer itemParamId);

    int insert(ItemParam record);

    int insertSelective(ItemParam record);

    ItemParam selectByPrimaryKey(Integer itemParamId);

    int updateByPrimaryKeySelective(ItemParam record);

    int updateByPrimaryKey(ItemParam record);
}