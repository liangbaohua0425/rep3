package com.my.controller;

import com.my.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = app.getBean("userService",IUserService.class);
        userService.getName();
    }
}
