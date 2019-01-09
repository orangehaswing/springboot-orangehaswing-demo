package com.orangehaswing.expendxml;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @PostMapping(value = "/user",consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User create(@RequestBody User user){
        user.setName("orangehaswing : " + user.getName());
        user.setAge(user.getAge() + 50);
        return user;
    }
}
