package com.li.spring.seconday;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        /*
        * 三中方式ApplicationContext注入
        * 一...
        *  @Autowired
        * private AnnotationConfigApplicationContext context;
        * 二...
        * implements ApplicationContextAware
        * 三...
        * public Bank(ApplicationContext context) { this.context = context;}
        *
        * */
        context.getBean(Bank.class).show();

        context.close();

    }

    @Test
    public void echoBeanPostProcessor() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        context.getBean(User.class).say();

        context.close();
    }

}
