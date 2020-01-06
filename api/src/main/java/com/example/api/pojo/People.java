package com.example.api.pojo;

import java.io.Serializable;

/**
 * @author WangXu
 * @create 2020/1/6 10:15
 */
public class People implements Serializable {

    private String name;


    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
