package com.orangehaswing.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private JavaMailSender jms;

    @Value("$(spring.mail.username)")
    private String from;

    @RequestMapping("sendSimpleEmail")
    public String sendSimpleEmail(){
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo("2792643826@qq.com");
            message.setSubject("email");
            message.setText("use springboot");
            jms.send(message);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
