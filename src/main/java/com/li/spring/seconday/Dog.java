package com.li.spring.seconday;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dog implements SpringContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {

        this.context = applicationContext;
    }

    public void show() {

        System.out.println("dog : " + context.getClass());
    }
}
