package com.hello.consumer.controller;

import com.hello.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/hello/app-name")
    public String echoAppName() {
        //return  "adsa";
        //Access through the combination of LoadBalanceClient and RestTemplate
        return consumerService.echo("hello world");
    }
}
