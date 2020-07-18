package com.kk.ioc.bean;

/**
 * @author kaikanwu
 * created on 5/30/2020
 */
public class House {


    public House() {

        System.out.println("House instantiation");
    }

    public void setUp() {
        System.out.println("House is initialized");
    }

    public void tearDown() {
        System.out.println("House is destroyed");
    }

}
