package com.zxc.common.util;

import java.util.Random;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 21:05
 * @Version 1.0
 *
 */
public class IDUtil {
    /*
    * 图片名生成
    * */
    public static String genImageName(){
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis +String.format("%03d",end3);
        return str;
    }

    /**
     * 商品id生成
     */
    public static long genItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }
}
