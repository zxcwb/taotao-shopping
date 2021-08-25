package com.zxc.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 21:58
 * @Version 1.0
 * data grid
 */
@Data
public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List<?> rows;
}
