package com.mine.provider;
import com.mine.testinterface.TestDubboInterface;

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
}
