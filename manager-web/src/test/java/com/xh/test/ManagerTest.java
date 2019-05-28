package com.xh.test;

import com.xh.mapper.UserMapper;
import com.xh.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UserMapper usersMapper;
    
    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(23);
        users.setUsername("李四");
        this.usersMapper.insertUser(users);
    }
}
