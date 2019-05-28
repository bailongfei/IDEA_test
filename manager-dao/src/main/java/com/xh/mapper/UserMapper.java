package com.xh.mapper;

import com.xh.pojo.Users;

import java.util.List;

public interface UserMapper {
    void  insertUser(Users  users);
    List<Users> selectUserAll();
}
