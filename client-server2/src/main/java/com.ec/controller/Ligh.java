package com.ec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @date 2018/3/19 16:36
 */
@RestController
public class Ligh {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("李国辉");
    }
}
