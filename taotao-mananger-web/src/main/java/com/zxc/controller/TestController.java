package com.zxc.controller;

import com.zxc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 11:36
 * @Version 1.0
 *
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String testNowTime(){
        //引入服务
        //调用服务
        System.out.println("进入controller");
        return testService.selectNowTime();
    }
}
