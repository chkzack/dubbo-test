package com.mine.provider;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisFuture;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.reactive.RedisReactiveCommands;
import io.lettuce.core.pubsub.RedisPubSubListener;
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;
import io.lettuce.core.pubsub.api.reactive.RedisPubSubReactiveCommands;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reactor.core.publisher.Flux;

/**
 * 测试dubbo provider
 *
 * @author chenh
 * @version 0.1
 * @date 2019/5/23
 */
public class DubboProvider {

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
