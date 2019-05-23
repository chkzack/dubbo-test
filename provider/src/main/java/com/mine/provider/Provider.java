package com.mine.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试dubbo provider
 *
 * @author chenh
 * @version 0.1
 * @date 2019/5/23
 */
public class Provider {

    /**
     * 测试dubbo provider主方法
     *
     * @author chenh
     * @date 2019/5/23 13:23
     */
    public static void main(String[] args) throws Exception{
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.out.println("provider start");
        System.in.read();
    }
}
