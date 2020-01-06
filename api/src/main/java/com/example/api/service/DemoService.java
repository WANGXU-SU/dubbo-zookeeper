package com.example.api.service;

import com.example.api.pojo.People;

/**
 * @author WangXu
 * @create 2020/1/6 9:15
 */
public interface DemoService {

    String sayHello(String str);

    People getPeople(String name);
}
