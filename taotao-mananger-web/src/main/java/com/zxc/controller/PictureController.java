package com.zxc.controller;

import com.alibaba.fastjson.JSON;
import com.zxc.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 22:52
 * @Version 1.0
 * 上传图片处理
 */
@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String picUpload(MultipartFile uploadFile) throws IOException {
        System.out.println("进入PicController");
        byte[] pic = uploadFile.getBytes();
        String oldName = uploadFile.getOriginalFilename();
        Map<String,Object> modelMap = pictureService.uploadPicture(pic,oldName);
        return JSON.toJSONString(modelMap);
    }
}
