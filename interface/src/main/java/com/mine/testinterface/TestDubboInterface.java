package com.mine.testinterface;

/**
 * dubbo 测试接口类
 *
 * @author chenh
 * @date 2019/5/23
 */
public interface TestDubboInterface {

    /**
     * 测试方法接口，输入名称，返回欢迎信息
     * @param name 输入姓名
     * @return String
     * @author chen
     */
    String hello(String name);
}
