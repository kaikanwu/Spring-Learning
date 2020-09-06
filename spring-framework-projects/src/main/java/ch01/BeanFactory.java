package ch01;

import ch01.dao.DaoDemo;
import ch01.dao.impl.DaoDemoImpl;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
public class BeanFactory {

//    public static DaoDemo getDaoDemo() {
//        return new DaoDemoImpl();
//    }


    public static DaoDemo getDaoDemo1() {
        try {
            return (DaoDemo) Class.forName("ch01.dao.impl.DaoDemoImpl1").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DaoDemo1 initializing failed");
        }
    }


}
