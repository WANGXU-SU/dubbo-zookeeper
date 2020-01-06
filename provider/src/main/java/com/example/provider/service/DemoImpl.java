package com.example.provider.service;

import com.example.api.pojo.People;
import com.example.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author WangXu
 * @create 2020/1/6 9:15
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
public class DemoImpl implements DemoService {
    @Override
    public String sayHello(String str) {
        System.out.println("dubbo测试:" + str);
        return "dubbo测试:" + str;
    }

    @Override
    public People getPeople(String name) {
        People people = new People();
        people.setName(name);
        people.setAge(1989);
        return people;
    }
}
