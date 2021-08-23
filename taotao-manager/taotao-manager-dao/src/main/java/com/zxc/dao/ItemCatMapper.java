package com.zxc.dao;

import com.zxc.entity.ItemCat;

public interface ItemCatMapper {
    int deleteByPrimaryKey(Integer itemCatId);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    ItemCat selectByPrimaryKey(Integer itemCatId);

    int updateByPrimaryKeySelective(ItemCat record);

    int updateByPrimaryKey(ItemCat record);
}