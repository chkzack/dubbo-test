package com.mine.testfactory;

import javax.naming.NameNotFoundException;

/**
 * 本地实现的工厂方法
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/28
 */
public class CarFactory {

    /**
     * 载具生成工厂方法
     *
     * @params name String 载具名称
     * @return com.mine.testfactory.Vehicle
     * @author chenh
     * @date 2019/5/28 11:27
     */
    public static Vehicle build(String name) throws NameNotFoundException {
        name = name.toUpperCase();
        switch(name){
            case "BICYCLE": return new Bicycle();
            case "CAR": return new Car();
            default: throw new NameNotFoundException("No such named vehicle");
        }
    }

    public static void main(String[] args) throws Exception{

        Vehicle bicycle = CarFactory.build("bicycle");
        bicycle.sayHello();

        Vehicle car = CarFactory.build("car");
        car.sayHello();

    }
}
