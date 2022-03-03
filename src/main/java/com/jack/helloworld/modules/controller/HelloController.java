package com.jack.helloworld.modules.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    public String port;

    @GetMapping(value = "getHello")
    public String getHello() {
        System.out.println(port);
        return "Hello World!";
    }
}
