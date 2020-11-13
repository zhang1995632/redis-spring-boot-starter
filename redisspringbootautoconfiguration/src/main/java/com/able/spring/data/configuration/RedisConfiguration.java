package com.able.spring.data.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.hello")
public class RedisConfiguration {

    private String aa;

    private String bb;
}
