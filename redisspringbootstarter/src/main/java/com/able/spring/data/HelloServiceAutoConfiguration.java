package com.able.spring.data;

import com.able.spring.data.configuration.RedisConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//标记该类是一个配置类
@ConditionalOnWebApplication//标记该自动配置类只有在 Web应用下才会生效
@EnableConfigurationProperties(SpringDemo.class)//开启自动属性配置
public class HelloServiceAutoConfiguration {

    @Bean//使用@Bean注解将该Bean注册到IOC容器中
    public SpringDemo helloService(){
        SpringDemo springDemo = new SpringDemo();
        //通过setHelloProperties()的方式来配置自定义属性值
        return springDemo;
    }
}
