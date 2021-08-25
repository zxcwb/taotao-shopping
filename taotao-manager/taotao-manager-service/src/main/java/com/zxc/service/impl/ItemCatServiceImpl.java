package com.zxc.service.impl;

import com.zxc.common.entity.EasyUITreeNode;
import com.zxc.dao.ItemCatMapper;
import com.zxc.entity.ItemCat;
import com.zxc.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 10:42
 * @Version 1.0
 * 商品分类管理
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(Integer parentId) {
        List<ItemCat> itemCatList = itemCatMapper.selectByParentId(parentId);
        List<EasyUITreeNode> easyUITreeNodesList = new ArrayList<>();
        for (ItemCat itemCat : itemCatList){
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
            easyUITreeNode.setId(itemCat.getItemCatId());
            easyUITreeNode.setState(itemCat.getIsParent()?"closed":"open");
            easyUITreeNode.setText(itemCat.getName());
            easyUITreeNodesList.add(easyUITreeNode);
        }
        return easyUITreeNodesList;
    }
}
