package com.xh.service.impl;

import com.xh.mapper.UserMapper;
import com.xh.pojo.Users;
import com.xh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
   @Autowired
   private UserMapper userMapper;
    public void addUser(Users users) {
        this.userMapper.insertUser(users);
    }
}
