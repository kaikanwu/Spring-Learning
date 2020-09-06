package ch01.dao.impl;

import ch01.dao.DaoDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
public class DaoDemoImpl implements DaoDemo {
    @Override
    public List<String> findAll() {
        return Arrays.asList("today", "tomorrow");
    }
}
