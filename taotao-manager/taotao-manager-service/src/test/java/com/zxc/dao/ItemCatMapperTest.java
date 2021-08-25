package com.zxc.dao;

import com.zxc.BaseTest;
import com.zxc.entity.ItemCat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 10:53
 * @Version 1.0
 *
 */
public class ItemCatMapperTest extends BaseTest {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Test
    public void selectByParentId() {
        List<ItemCat> itemCatList = itemCatMapper.selectByParentId(1);
        for (ItemCat itemCat : itemCatList){
            System.out.println(itemCat);
        }
    }
}