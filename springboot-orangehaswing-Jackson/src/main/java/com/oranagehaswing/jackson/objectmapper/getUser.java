package com.oranagehaswing.jackson.objectmapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class getUser {

    @GetMapping("getuser")
    public User getuser(){
        User user = new User();
        user.setUserName("orangehaswing");
        user.setBirthday(new Date());
        return user;
    }

}
