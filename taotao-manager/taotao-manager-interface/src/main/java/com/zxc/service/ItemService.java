package com.zxc.service;

import com.zxc.common.entity.EasyUIDataGridResult;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 22:18
 * @Version 1.0
 * 商品相关的接口
 */
public interface ItemService {
    EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
