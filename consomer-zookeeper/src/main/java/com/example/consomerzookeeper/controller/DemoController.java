package com.example.consomerzookeeper.controller;

import com.chen.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //    @DubboReference(version = "1.0", url = "dubbo://127.0.0.1:12345")
//    @DubboReference(version = "${service.version}", url = "${service.url}")
    @DubboReference(version = "${demo.service.version}")
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.sayHello(name);
    }
}
