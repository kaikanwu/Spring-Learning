package com.kk.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kaikanwu
 * created on 5/24/2020
 */
public class BeanDemo {


    public static void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("bean1");

    }

    public static void demo2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("bean2");
    }


    public static void demo3() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        applicationContext.getBean("bean3");
    }



    public static void main(String[] args) {
        demo3();
    }

}
