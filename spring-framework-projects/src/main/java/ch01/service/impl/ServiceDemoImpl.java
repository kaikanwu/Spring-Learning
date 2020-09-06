package ch01.service.impl;

import ch01.BeanFactory;
import ch01.dao.DaoDemo;
import ch01.dao.impl.DaoDemoImpl;
import ch01.service.ServiceDemo;

import java.util.List;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
public class ServiceDemoImpl implements ServiceDemo {

    private DaoDemo daoDemo = BeanFactory.getDaoDemo1();

    @Override
    public List<String> findAll() {
        return daoDemo.findAll();
    }
}
