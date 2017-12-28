package com.li.spring.firstday;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Mybean bean = context.getBean(Mybean.class);

        System.out.println(bean.getClass().getName());

        context.close();

    }
    @Test
    public void createBean() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(context.getBean(Mybean.class));
        //System.out.println(context.getBean("createMyBean"));
        System.out.println(context.getBean("defined-name"));

        context.close();
    }

    @Test //工厂创建bean 第一种方式
    public void beanFactory() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        //根据类型得到bean工厂
        System.out.println(context.getBean(CayenneFactoryBean.class));
        //根据&+name得到bean工厂,!!!不加&,得到的是工厂创建出来的bean
        System.out.println(context.getBean("&defined-factoryname"));

        System.out.println(context.getBean("defined-factoryname"));
        System.out.println(context.getBean(Cayenne.class));

        context.close();
    }

    @Test //工厂创建bean 第二种方式
    public void injectFactoryBean() throws Exception{

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(context.getBean(JeepFactory.class));
        System.out.println(context.getBean("createJeepFactory"));


        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createJeep"));

        context.close();
    }


}
