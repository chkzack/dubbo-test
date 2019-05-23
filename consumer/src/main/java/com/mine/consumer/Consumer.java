package com.mine.consumer;

import com.mine.testinterface.TestDubboInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试dubbo consumer
 *
 * @author chenh
 * @version 0.1
 * @date 2019/5/23
 */
public class Consumer {

    /**
     * 测试dubbo consumer主方法
     *
     * @author chenh
     * @date 2019/5/23 13:17
     */
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // 调用dubboRPC服务
        TestDubboInterface bean = (TestDubboInterface)context.getBean("demoService");
        String greetings = bean.hello("zack");
        System.out.println(greetings);
    }
}
