package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.pojo.People;
import com.example.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangXu
 * @create 2020/1/6 9:38
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0",loadbalance="roundrobin")
    private DemoService demoService;

    @GetMapping("/demo/{str}")
    public String demo(@PathVariable("str") String str) {
        return demoService.sayHello(str);
    }

    @GetMapping("/demo/peo/{name}")
    public People getPeople(@PathVariable("name") String name) {
        return demoService.getPeople(name);
    }
}
