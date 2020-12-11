package com.cq.im.netty;

import com.cq.im.netty.config.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.InetSocketAddress;
//暂时取消数据库配置
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class NettAppliction {

    public static void main(String[] args) {
        SpringApplication.run(NettAppliction.class);
        //启动服务端
        NettyServer nettyServer = new NettyServer();
        nettyServer.start(new InetSocketAddress("127.0.0.1", 8091));
    }
}
