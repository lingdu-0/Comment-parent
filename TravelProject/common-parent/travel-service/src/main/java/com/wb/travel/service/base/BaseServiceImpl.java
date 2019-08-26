package com.wb.travel.service.base;

import com.wb.travel.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    //统一注入dao
    @Autowired
    private UserDao userDao;
}
