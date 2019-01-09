package com.oranagehaswing.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oranagehaswing.jackson.objectmapper.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class serialization {

    @Autowired
    ObjectMapper mapper;

    @GetMapping("/serialization")
    public String serializatioacc(){
        try {
            User user = new User();
            user.setUserName("orangehaswing");
            user.setBirthday(new Date());
            String str = mapper.writeValueAsString(user);
            return str;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
