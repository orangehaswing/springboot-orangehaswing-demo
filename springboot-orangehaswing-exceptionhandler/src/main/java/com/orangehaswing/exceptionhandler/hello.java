package com.orangehaswing.exceptionhandler;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class hello {

    public String helloworld() throws Exception{
        throw new Exception("error happened");
    }
}
