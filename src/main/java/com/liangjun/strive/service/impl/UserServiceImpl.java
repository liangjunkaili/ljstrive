package com.liangjun.strive.service.impl;

import com.liangjun.strive.bean.User;
import com.liangjun.strive.dao.UserDao;
import com.liangjun.strive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> queryUsers() {
        return userDao.queryUsers();
    }
}
