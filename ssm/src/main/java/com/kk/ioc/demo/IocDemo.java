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

    public static void demo1_1() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("trytry");
        userService.sayHello();

    }


    public static void demo2() {

        // Spring 的工厂类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获取类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }




    public static void main(String[] args) {
        demo1_1();
//        demo2();
    }




}
