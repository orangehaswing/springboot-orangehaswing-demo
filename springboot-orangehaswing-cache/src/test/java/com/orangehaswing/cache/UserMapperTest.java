package com.orangehaswing.cache;

import com.orangehaswing.cache.user.User;
import com.orangehaswing.cache.user.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception{
        userMapper.insert("AB",20);
        User u = userMapper.findByName("AB");
        Assert.assertEquals(20,u.getAge().intValue());
    }

    @Test
    public void test() throws Exception{
        User u1 = userMapper.findByName("AB");
        System.out.println("AB :" + u1.getName());
        User u2 = userMapper.findByName("ABC");
        System.out.println("ABC :" + u2.getName());
    }


}