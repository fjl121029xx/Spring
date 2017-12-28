package com.li.spring.beanInit_destory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pig {

    private String name;

    @PostConstruct
    public void intial() {

        this.name = "emo";
        System.out.println("=====intial=====");
    }

    @PreDestroy
    public void close() {

        this.name = "h1z1";
        System.out.println("=====close=====");
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }
}
