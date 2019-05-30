package com.mine.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisFuture;
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;

import java.time.Duration;

/**
 * Redis 订阅发布注册测试程序
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/29
 */
public class RedisSubscriber implements Runnable{

    private static int loopTimes = 5;

    @Override
    public void run() {
        RedisClient client = RedisClient.create("redis://localhost:6379");
        client.setDefaultTimeout(Duration.ofSeconds(10L));
        StatefulRedisPubSubConnection<String, String> connect = client.connectPubSub();
        connect.addListener(new MyPubSubListener());

        RedisPubSubAsyncCommands commands = connect.async();
        RedisFuture future = commands.subscribe("channel");

        int count = 0;

        while(true) {
            count ++;
            if(count > 10) { break; }
            try {
                Thread.sleep(1000);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }

        connect.close();
        client.shutdown();
    }

    public static void main(String[] args) {

        for(int i=0; i<loopTimes; i++) {
            new Thread(new RedisSubscriber()).start();
            try {
                Thread.sleep(1000);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }

    }
}
