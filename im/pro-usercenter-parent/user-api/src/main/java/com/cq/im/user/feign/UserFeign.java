package com.cq.im.user.feign;

import com.cq.im.user.config.ServiceGateWayConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "UserService", description = "用户服务", protocols = "application/json")
@FeignClient(name = ServiceGateWayConfig.SERVER_NAME)
@RequestMapping(value = "/v1/user")
public interface UserFeign {

    @ApiOperation(value = "测试", notes = "测试")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
