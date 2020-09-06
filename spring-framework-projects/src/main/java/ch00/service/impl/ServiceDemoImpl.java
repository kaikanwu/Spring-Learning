package ch00.service.impl;

import ch00.dao.DaoDemo;
import ch00.dao.impl.DaoDemoImpl;
import ch00.service.ServiceDemo;

import java.util.List;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
public class ServiceDemoImpl implements ServiceDemo {

    private DaoDemo daoDemo = new DaoDemoImpl();

    @Override
    public List<String> findAll() {
        return daoDemo.findAll();
    }
}
