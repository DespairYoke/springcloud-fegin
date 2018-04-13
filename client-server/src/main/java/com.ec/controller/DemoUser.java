package com.ec.controller;

import com.ec.service.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @date 2018/3/15 17:09
 */
@RequestMapping
@RestController
public class DemoUser {
    @Autowired
    public HelloInterface helloInterface;
    @RequestMapping("/")
    public void home() {
        System.out.println("zzzzz");
         helloInterface.hello();
    }
}
