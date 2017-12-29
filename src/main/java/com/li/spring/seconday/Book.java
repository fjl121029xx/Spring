package com.li.spring.seconday;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Book implements ApplicationContextAware {
    /*
        spring bean 初始化之后,那么就判断是不是ApplicationContextAware的子类,如果是的话,那就会调用setApplicationContext方法,
    并把applicationContext 传入进去
    */
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.context = applicationContext;
    }

    public void show() {

        System.out.println("Book : " + context.getClass());
    }
}
