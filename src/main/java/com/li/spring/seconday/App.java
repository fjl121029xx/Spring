package com.li.spring.seconday;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);

        context.getBean(User.class).show();

        context.close();

    }

}
