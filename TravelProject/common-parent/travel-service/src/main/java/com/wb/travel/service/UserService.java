package com.wb.travel.service;

import com.wb.travel.entity.User;
import com.wb.travel.service.base.BaseService;

public interface UserService extends BaseService<User> {
    //特有方法
    User login(String name,String password);
}
