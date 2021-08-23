package com.zxc.service.impl;

import com.zxc.dao.TestDao;
import com.zxc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Author: zxc of Russell
 * @Date: 2021/8/23 11:51
 * @Version 1.0
 *
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public String selectNowTime() {
        return testDao.selectNowTime();
    }
}
