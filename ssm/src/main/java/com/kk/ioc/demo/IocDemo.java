package com.kk.ioc.demo;

import com.kk.ioc.UserService;
import com.kk.ioc.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaikanwu
 * created on 5/20/2020
 */
public class IocDemo {



    public static void demo1() {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    public static void demo2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }




    public static void main(String[] args) {
        demo2();
    }




}
