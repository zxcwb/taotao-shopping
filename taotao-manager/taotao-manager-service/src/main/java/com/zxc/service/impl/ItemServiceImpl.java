package com.zxc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxc.common.entity.EasyUIDataGridResult;
import com.zxc.dao.ItemMapper;
import com.zxc.entity.Item;
import com.zxc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 22:19
 * @Version 1.0
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    /*
    * 根据当前的页码和每页的函数进行分页查询
    * */
    @Override
    public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        //设置分页的信息
        if (page != null && rows != null){
            PageHelper.startPage(page,rows);
            //注入mapper
            //创建example对象
            //根据mapper调查查询的所有的方法
            List<Item> itemList = itemMapper.selectAllItem();
            //获取分页信息
            PageInfo<Item> itemPageInfo = new PageInfo<Item>(itemList);
            //封装到EasyUIDataGridResult
            result.setTotal((int) itemPageInfo.getTotal());
            result.setRows(itemPageInfo.getList());
        }
        return result;
    }
}
