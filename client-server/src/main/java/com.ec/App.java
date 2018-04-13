package com.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @date 2018/3/15 16:55
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
