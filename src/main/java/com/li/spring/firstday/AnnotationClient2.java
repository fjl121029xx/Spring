package com.li.spring.firstday;

import com.li.spring.firstday.beanInit_destory.Dog;
import com.li.spring.firstday.fit_outbean.UserController;
import com.li.spring.firstday.fit_outbean.UserDao;
import com.li.spring.firstday.fit_outbean.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);


        System.out.println(context.getBean("user"));
        System.out.println(context.getBeansOfType(Dog.class));


        System.out.println(context.getBean(UserDao.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));

        context.close();
    }
}
