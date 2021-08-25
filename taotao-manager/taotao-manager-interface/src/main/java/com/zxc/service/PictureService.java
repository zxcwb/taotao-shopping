package com.zxc.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 17:12
 * @Version 1.0
 *
 */
public interface PictureService {
    Map<String,Object> uploadPicture(byte[] pic,String oldName);
}
