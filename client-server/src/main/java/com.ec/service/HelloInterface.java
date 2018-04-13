package com.ec.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zwd
 * @date 2018/3/19 16:32
 */
@FeignClient(name = "client-server2")
public interface HelloInterface {
    @RequestMapping("/hello")
     void hello();
}
