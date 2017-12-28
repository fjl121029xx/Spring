package com.li.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mybean {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(context.getBean(Mybean.class));
        //System.out.println(context.getBean("createMyBean"));
        System.out.println(context.getBean("defined-name"));

        context.close();
    }

    @Test
    public void beanFactory() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        System.out.println(context.getBean(CayenneFactoryBean.class));
        System.out.println(context.getBean("&getCayenneFactoryBean"));

        System.out.println(context.getBean("getCayenneFactoryBean"));
        System.out.println(context.getBean(Cayenne.class));


        context.close();
    }


}

