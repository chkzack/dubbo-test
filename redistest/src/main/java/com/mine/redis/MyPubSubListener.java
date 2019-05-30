package com.mine.redis;

import io.lettuce.core.pubsub.RedisPubSubListener;

/**
 * 测试监听器
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/29
 */
public class MyPubSubListener implements RedisPubSubListener {
    @Override
    public void message(Object o, Object o2) {
        System.out.println(o + ":" + o2);
    }

    @Override
    public void message(Object o, Object k1, Object o2) {
        System.out.println(o + ":" + k1 + ":" + o2);
    }

    @Override
    public void subscribed(Object o, long l) {
        System.out.println("sub:" + o + ":" + l);
    }

    @Override
    public void psubscribed(Object o, long l) {
        System.out.println("psub:" + o + ":" + l);
    }

    @Override
    public void unsubscribed(Object o, long l) {
        System.out.println("unsub:" + o + ":" + l);
    }

    @Override
    public void punsubscribed(Object o, long l) {
        System.out.println("punsub:" + o + ":" + l);
    }
}
