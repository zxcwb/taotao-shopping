package com.zxc.service.impl;

import com.zxc.common.util.IDUtil;
import com.zxc.common.util.SFTPUtil;
import com.zxc.service.PictureService;
import org.apache.http.entity.ContentType;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 18:07
 * @Version 1.0
 */
@Service
public class PictureServiceImpl implements PictureService {


    private String username;
    /** SFTP 登录密码*/
    private String password;
    /** SFTP 服务器地址IP地址*/
    private String host;
    /** SFTP 端口*/
    private String port;
    private String sftp_base_path;
    private String image_base_url;

    @Value("${SFTP_USERNAME}")
    public void setUsername(String username) {
        this.username = username;
    }

    @Value("${SFTP_PASSWORD}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${SFTP_HOST}")
    public void setHost(String host) {
        this.host = host;
    }

    @Value("${SFTP_PORT}")
    public void setPort(String port) {
        this.port = port;
    }

    @Value("${SFTP_BASE_PATH}")
    public void setSftp_base_path(String sftp_base_path) {
        this.sftp_base_path = sftp_base_path;
    }

    @Value(("${IMAGE_BASE_URL}"))
    public void setImage_base_url(String image_base_url) {
        this.image_base_url = image_base_url;
    }

    @Override
    public Map<String, Object> uploadPicture(byte[] pic,String oldName) {
        Map<String,Object> modelMap = new HashMap<>();
        InputStream inputStream = new ByteArrayInputStream(pic);
        try {
           // MultipartFile uploadFile = new MockMultipartFile(MediaType.APPLICATION_OCTET_STREAM_VALUE,inputStream);
            //生成新的文件名
            /*//取原始文件名
            String oldName = uploadFile.getOriginalFilename();*/
            //生成新的文件名
            //UUID.randomUUID();
            String newName = IDUtil.genImageName();
            newName = newName + oldName.substring(oldName.lastIndexOf("."));
            String basePath = sftp_base_path.substring(0,4);
            String directory = sftp_base_path.substring(sftp_base_path.lastIndexOf("taotao"));
            //图片上传
            String imagePath = new DateTime().toString("/yyyy/MM/dd");
            SFTPUtil.uploadFile(username,password,host,port,basePath,directory+imagePath,newName,inputStream);
            modelMap.put("error",0);
            modelMap.put("message","文件上传成功");
            modelMap.put("url",image_base_url+imagePath+"/"+newName);
        }catch (Exception e){
            modelMap.put("error",1);
            modelMap.put("message","文件上传失败");
        }
        return modelMap;
    }

}
