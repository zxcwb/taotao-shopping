package com.zxc.common.entity;

import java.io.Serializable;
import java.util.List;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 21:58
 * @Version 1.0
 * data grid
 */
public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
