package com.li.spring.beanInit_destory;

import com.li.spring.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    @Test//bean 装配初始化属性 第一种方式 implements InitializingBean,DisposableBean
    public void initiaBeanProperties() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);

        System.out.println(cat.getName());
        System.out.println(cat);

        context.close();

        System.out.println(cat.getName());

    }

    @Test//第二种方式   @Bean(initMethod = "init", destroyMethod = "destory")
    public void declataBeanProperties() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Dog dog = context.getBean(Dog.class);
        System.out.println(dog.getName());


        System.out.println(dog);

        context.close();

        System.out.println(dog);
        System.out.println(dog.getName());
    }

    @Test//第三种方式  第三种方式  javax  @PostConstruct  @PreDestroy
    public void javaxBeanProperties() throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pig pig = context.getBean(Pig.class);
        System.out.println(pig.getName());

        System.out.println(pig);

        context.close();

        System.out.println(pig);
        System.out.println(pig.getName());

    }
}
