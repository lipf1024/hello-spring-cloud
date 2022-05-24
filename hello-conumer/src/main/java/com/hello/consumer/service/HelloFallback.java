package com.hello.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class HelloFallback implements  ConsumerService{
    @Override
    public String echo(String string) {
        return "fallback";
    }
}
