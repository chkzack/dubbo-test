package com.mine.service;
import com.mine.testfactory.Bicycle;
import com.mine.testfactory.Car;
import com.mine.testfactory.Vehicle;
import com.mine.testinterface.TestDubboInterface;

import javax.naming.NameNotFoundException;

/**
 * dubbo provider 测试类
 *
 * @author chenh
 * @date 2019/5/23
 */
public class TestDubboInterfaceImpl implements TestDubboInterface {

    /**
     * 测试dubbo provider，输入名称，返回欢迎语句
     *
     * @param name 输入姓名
     * @return String 问候语
     * @author chenh
     * @date 2019/5/23 11:12
     */
    @Override
    public String hello(String name){
        return "Hello," + name;
    }

    /**
     * 测试dubbo 返回对象
     *
     * @params name
     * @return com.mine.testfactory.Vehicle
     * @author chenh
     * @date 2019/5/28 13:37
     */
    @Override
    public Vehicle build(String name) throws NameNotFoundException{
        name = name.toUpperCase();
        switch (name) {
            case "BICYCLE": return new Bicycle();
            case "CAR": return new Car();
            default: throw new NameNotFoundException("No such named vehicle");
        }
    }
}
