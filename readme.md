## 项目说明
##### 这是仿照DUBBO官方的快速入门例子写的dubbo测试程序，便于自己查看理解
    
    修改  使用zookeeper作为注册中心进行测试, 使用curator做为zookeeper的连接客户端
    
#### 记一次调试问题

    docker 启动 zookeeper:3.5
    curator 4.x.x版本可同时支持 zookeeper 3.5 和 3.4 版本
    但如果使用 zookeeper 3.4 版本 curator recipes 的maven依赖中需要去除zookeeper的依赖包
    
    <exclusions>
        <exclusion>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
        </exclusion>
    </exclusions>
