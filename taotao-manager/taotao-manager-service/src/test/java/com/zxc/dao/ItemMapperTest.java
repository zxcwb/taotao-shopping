package com.zxc.dao;

import com.zxc.BaseTest;
import com.zxc.entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/25 22:23
 * @Version 1.0
 *
 */
public class ItemMapperTest extends BaseTest {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void selectAllItem() {
        List<Item> itemList = itemMapper.selectAllItem();
        for (Item item : itemList){
            System.out.println(item);
        }
    }
}