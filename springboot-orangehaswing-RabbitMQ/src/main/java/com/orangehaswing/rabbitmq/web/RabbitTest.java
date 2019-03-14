package com.orangehaswing.rabbitmq.web;

import com.orangehaswing.rabbitmq.Component.HelloSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender1 helloSender2;

    @PostMapping("/hello")
    public void hello() {
        helloSender1.send();
    }


}
