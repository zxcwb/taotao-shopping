package com.zxc.dao;

import com.zxc.entity.ItemDesc;

public interface ItemDescMapper {
    int deleteByPrimaryKey(Integer itemDescId);

    int insert(ItemDesc record);

    int insertSelective(ItemDesc record);

    ItemDesc selectByPrimaryKey(Integer itemDescId);

    int updateByPrimaryKeySelective(ItemDesc record);

    int updateByPrimaryKey(ItemDesc record);
}