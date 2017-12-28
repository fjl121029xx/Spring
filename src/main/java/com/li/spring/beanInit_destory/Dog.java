package com.li.spring.beanInit_destory;

import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean{

    private String name;

    public void init() {

        this.name = "老二";
        System.out.println("=====init======");
    }

    public void destory() {

        this.name = "小七";
        System.out.println("=====destory======");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        this.name = "小黑";
        System.out.println("=====afterPropertiesSet======");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
