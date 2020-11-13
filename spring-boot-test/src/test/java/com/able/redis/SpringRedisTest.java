package com.able.redis;

import com.able.spring.data.SpringDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SpringRedisTest {

    @Autowired
    private SpringDemo springDemo;

    @Test
    public void test(){
        springDemo.getDemo();
    }
}
