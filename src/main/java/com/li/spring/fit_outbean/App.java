package com.li.spring.fit_outbean;

import com.li.spring.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.li.spring");

//      System.out.println(context.getBean(User.class));
        System.out.println(context.getBean("myuser"));
        System.out.println(context.getBeansOfType(User.class));


        System.out.println(context.getBean(UserDao.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));

        context.close();
    }

    @Test
    public void select() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MyConfig.class, User.class, UserDao.class, UserService.class, UserController.class);

        UserService userService = context.getBean(UserService.class);

        userService.select();

        context.close();
    }
}
