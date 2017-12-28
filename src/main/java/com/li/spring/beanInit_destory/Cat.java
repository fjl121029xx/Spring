package com.li.spring.beanInit_destory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Bean 初始化 第一种方式
 */
public class Cat implements InitializingBean,DisposableBean {

    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        //bean装配之后,初始化属性
        this.name = "小白2";
        System.out.println("=====afterPropertiesSet=====");
    }

    @Override
    public void destroy() throws Exception {
        this.name = null;
        System.out.println("=====destroy=====");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
