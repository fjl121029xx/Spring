package com.li.spring.seconday;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Bank {
    /**
     * 获取ApplicationContext
     * spring 4.3新特性
     *
     * 需要注意:
     * 1:构造函数只能有一个,如果有多个的话,就必须有一个无参的构造函数,此时,spring会调用无参的构造函数
     * 2:构造函数的参数,必须都要在spring容器中有
     */
    private ApplicationContext context;

    public Bank(ApplicationContext context) {

        this.context = context;
    }

    public void show() {

        System.out.println("Bank : " + context.getClass());
    }
}
