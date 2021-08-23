package com.zxc.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxc.BaseTest;
import com.zxc.dao.ItemMapper;
import com.zxc.entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 17:27
 * @Version 1.0
 *
 */

public class TestPageHelper extends BaseTest {

    @Autowired
    private ItemMapper itemMapper;
    @Test
    public void testHelper(){
        //1、设置分页信息
        PageHelper.startPage(1,3);
        //2、初始化spring容器
        //3、获取mapper的代理对象
        //4、调用mapper的方法查询数据
        List<Item>  itemList = itemMapper.selectAllItem();
        PageInfo<Item> pageInfo = new PageInfo<Item>(itemList);

        //5、循环遍历结果集 打印
        System.out.println("查询数据记录总数："+pageInfo.getTotal());

        for (Item item : itemList){
            System.out.println(item.getItemId()+"<<<"+item.getTitle());
        }
    }
}
