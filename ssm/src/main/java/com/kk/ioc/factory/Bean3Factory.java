package com.kk.ioc.factory;

import com.kk.ioc.bean.Bean3;

/**
 * @author kaikanwu
 * created on 5/24/2020
 */
public class Bean3Factory {

    public Bean3 createBean3() {
        System.out.println("Bean3 initializing");
        return new Bean3();
    }

}
