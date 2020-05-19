package com.kk.ioc.impl;

import com.kk.ioc.UserService;

/**
 * @author kaikanwu
 * created on 5/20/2020
 */
public class UserServiceImpl implements UserService {

    @Override
    public void sayHello() {

        System.out.println("Hello 2020");
    }
}
