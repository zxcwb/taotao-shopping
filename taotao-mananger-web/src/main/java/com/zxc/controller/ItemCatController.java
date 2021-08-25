package com.zxc.controller;

import com.zxc.common.entity.EasyUITreeNode;
import com.zxc.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 11:33
 * @Version 1.0
 *
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public List<EasyUITreeNode> itemCatList(@RequestParam(value = "id",defaultValue = "0")Integer parentId){
        List<EasyUITreeNode> easyUITreeNodeList = itemCatService.getItemCatList(parentId);
        return easyUITreeNodeList;
    }
}
