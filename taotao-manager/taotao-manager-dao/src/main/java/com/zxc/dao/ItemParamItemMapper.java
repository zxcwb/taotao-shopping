package com.zxc.dao;

import com.zxc.entity.ItemParamItem;

public interface ItemParamItemMapper {
    int deleteByPrimaryKey(Integer itemParamItemId);

    int insert(ItemParamItem record);

    int insertSelective(ItemParamItem record);

    ItemParamItem selectByPrimaryKey(Integer itemParamItemId);

    int updateByPrimaryKeySelective(ItemParamItem record);

    int updateByPrimaryKey(ItemParamItem record);
}