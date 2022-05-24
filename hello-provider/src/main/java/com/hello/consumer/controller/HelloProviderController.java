package com.hello.consumer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hello/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string + ",port:" + port;
    }
}
