package com.li.spring.seconday;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        /*
        * 三中方式ApplicationContext注入
        * 一...User
        *  @Autowired
        * private AnnotationConfigApplicationContext context;
        * 二...Book
        * implements ApplicationContextAware
        * 三...Bank
        * public Bank(ApplicationContext context) { this.context = context;}
        *
        * */
        context.getBean(Bank.class).show();

        context.close();

    }

    @Test
    public void echoBeanPostProcessor() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, Dog.class);

        context.getBean(Dog.class).show();

        //context.addBeanFactoryPostProcessor();

        context.close();
    }

}
