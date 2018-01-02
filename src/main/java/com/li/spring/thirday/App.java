package com.li.spring.thirday;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.li.spring.thirday");

        context.getBean("user");
        System.out.println(context.getBeansOfType(User.class));
        context.close();
    }

    @Test
    public void testMyBeanFactoryPostProcessor() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.li.spring.thirday");

        System.out.println(context.getBeansOfType(Person.class));
        context.close();
    }

    @Test
    public void testMyBeanDefinitionRegistryPostProcessor() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.li.spring.thirday");

        System.out.println(context.getBeansOfType(Person.class));
        context.close();
    }

    @Test
    public void testRegistBean() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.li.spring.thirday");

        //context.registerBeanDefinition();
        context.close();
    }
}
