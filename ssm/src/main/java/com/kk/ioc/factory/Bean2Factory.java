package com.kk.ioc.factory;

import com.kk.ioc.bean.Bean1;
import com.kk.ioc.bean.Bean2;

/**
 * @author kaikanwu
 * created on 5/24/2020
 */
public class Bean2Factory {


    public static Bean2 createBean2() {
        System.out.println("Bean2 initializing");
        return new Bean2();
    }




}
