package com.mine.provider;

import com.google.gson.annotations.Since;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.List;

/**
 * curator测试类 用于测试curator是否能连接zookeeper
 *
 * @author chenh
 * @version 0.1
 * @date 2019/5/23
 */
@Since(1.8)
public class CuratorTest {

    public static void main(String[] args) throws Exception{
        RetryPolicy policy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:21810", policy);
        client.start();
        client.create().forPath("/dubbo");
        client.getChildren().watched().forPath("/").forEach( e -> System.out.println(e));
        client.close();
    }
}
