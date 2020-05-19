package com.kk.ioc.impl;

import com.kk.ioc.UserService;

/**
 * @author kaikanwu
 * created on 5/20/2020
 */
public class UserServiceImpl implements UserService {



    private String name;

    @Override
    public void sayHello() {

        System.out.println("Hello 2020" + name);
    }


    public void setName(String name) {
        this.name = name;
    }
}
