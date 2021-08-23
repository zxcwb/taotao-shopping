package com.zxc.dao;

import com.zxc.entity.OrderShipping;

public interface OrderShippingMapper {
    int deleteByPrimaryKey(Integer orderShippingId);

    int insert(OrderShipping record);

    int insertSelective(OrderShipping record);

    OrderShipping selectByPrimaryKey(Integer orderShippingId);

    int updateByPrimaryKeySelective(OrderShipping record);

    int updateByPrimaryKey(OrderShipping record);
}