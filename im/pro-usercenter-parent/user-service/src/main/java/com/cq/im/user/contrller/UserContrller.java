package com.cq.im.user.contrller;

import com.cq.im.user.feign.UserFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContrller implements UserFeign {


    @Override
    public String hello() {
        return "hello word";
    }
}
