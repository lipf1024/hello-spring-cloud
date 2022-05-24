package com.hello.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "hello-provider",fallback = HelloFallback.class)
public interface ConsumerService {

    @GetMapping(value = "/hello/{string}")
    String echo(@PathVariable String string);
}
