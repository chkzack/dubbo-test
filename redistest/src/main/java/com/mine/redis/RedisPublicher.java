package com.mine.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;

/**
 * Redis 订阅发布模式 测试 publisher luttuce
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/29
 */
public class RedisPublicher {

    public static void main(String[] args) throws Exception{
        RedisClient client = RedisClient.create("redis://localhost:6379");
        StatefulRedisPubSubConnection<String, String> connect = client.connectPubSub();

        RedisPubSubAsyncCommands<String, String> commands = connect.async();
        commands.pubsubChannels("channle").get().forEach(System.out::println);
        int count = 0;

        while (true){
            String message = "Hello! " + Math.random()*1000;
            System.out.println(message);
            commands.publish("channel", message);
            count ++;
            Thread.sleep(2000);
            commands.pubsubNumsub("channel").get().forEach( (bi, num) -> { System.out.println(bi + ":" + num);});
            if(count > 10) { break; }
        }

        connect.close();
        client.shutdown();
    }
}
