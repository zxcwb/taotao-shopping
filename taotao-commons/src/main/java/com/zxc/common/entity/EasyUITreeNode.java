package com.zxc.common.entity;

import lombok.Data;

import java.io.Serializable;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/24 10:33
 * @Version 1.0
 * easyUI树形控制节点
 */
@Data
public class EasyUITreeNode implements Serializable {
    private Long id;
    private String text;
    private String state;
}
