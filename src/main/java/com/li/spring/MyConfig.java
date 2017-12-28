package com.li.spring;

import com.li.spring.beanInit_destory.Dog;
import com.li.spring.beanInit_destory.Pig;
import com.li.spring.fit_outbean.User;
import com.li.spring.fit_outbean.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration//声明这是一个配置类
public class MyConfig {
    @Bean(name = "defined-name")//自定义bean的name
    @Scope("prototype")
    public Mybean createMyBean() {//bean的名字默认是方法的名字,默认

        return new Mybean();
    }

    //工厂创建bean第一种方式 implements FactoryBean
    @Bean(name = "defined-factoryname")
    public CayenneFactoryBean getCayenneFactoryBean() {

        return new CayenneFactoryBean();//返回工厂bean
    }

    //工厂创建bean第二种方式
    @Bean
    public JeepFactory createJeepFactory() {

        return new JeepFactory();
    }

    @Bean
    public Jeep createJeep(JeepFactory jeepFactory) {
        return jeepFactory.create();
    }

    //Bean的初始化 第一种方式 implements InitializingBean
    /*@Bean
    public Cat createCat() {
        return new Cat();
    }*/

    //Bean的初始化 第二种方式 自己声明init,destory方法
    /*@Bean(initMethod = "init", destroyMethod = "destory")
    public Dog createDog() {

        return new Dog();
    }*/

    //Bean的初始化  第三种方式  javax  @PostConstruct  @PreDestroy
    /*@Bean
    public Pig createPig() {

        return new Pig();
    }*/

    //Bean的装配
    @Bean(name = "user")
    public User createUser(){

        return new User();
    }

    /*@Bean
    @Primary
    public UserDao createUserDao(){

        return new UserDao();
    }*/



}
