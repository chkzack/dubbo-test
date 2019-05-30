package com.mine.testfactory;

import java.io.Serializable;

/**
 * 自行车测试类 继承Vehicle
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/28
 */
public class Bicycle extends Vehicle implements Serializable {

    public static final String serial = "1";

    public Bicycle(){
        super(2,0);
    }

    @Override
    public void sayHello(){
        System.out.println("This is bicycle! I hasve "+super.getWheels()+" wheels and " + super.getDoors() + " doors");
    }
}
