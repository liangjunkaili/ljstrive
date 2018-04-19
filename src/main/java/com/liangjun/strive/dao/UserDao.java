package com.liangjun.strive.dao;

import com.liangjun.strive.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> queryUsers();
}
