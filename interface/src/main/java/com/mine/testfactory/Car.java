package com.mine.testfactory;

import java.io.Serializable;

/**
 * 汽车测试类 继承Vehilce
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/28
 */
public class Car extends Vehicle implements Serializable {

    public static final String serial = "1";

    public Car(){
        super(4,4);
    }

    @Override
    public void sayHello(){
        System.out.println("This is car! I have "+ super.getWheels() + " wheels and " + super.getDoors() + " doors.");
    }
}
