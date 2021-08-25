package com.zxc.controller;

import com.zxc.common.entity.EasyUIDataGridResult;
import com.zxc.common.entity.TaotaoResult;
import com.zxc.entity.Item;
import com.zxc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 22:32
 * @Version 1.0
 *
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //1、引入注入服务
        //2、调用服务方法
        return itemService.getItemList(page,rows);
    }

    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult createItem(Item item){
       TaotaoResult result =  itemService.addItem(item);
       return result;
    }
}
