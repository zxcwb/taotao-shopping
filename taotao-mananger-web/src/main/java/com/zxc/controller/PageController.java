package com.zxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 16:43
 * @Version 1.0
 * 显示页面
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    //显示商品的查询页面
    @RequestMapping("{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
