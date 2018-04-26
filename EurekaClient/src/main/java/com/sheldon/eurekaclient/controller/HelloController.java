package com.sheldon.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String home(@RequestParam String name) {
        System.out.println("hi "+name+",i am from port:" +port);
        return "hi "+name+",i am from port:" +port;
    }

}
