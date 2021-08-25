package com.zxc.service;

import com.zxc.common.entity.EasyUITreeNode;

import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 10:41
 * @Version 1.0
 *
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(Integer parentId);
}
