package com.li.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean(name = "bean")
    @Scope("prototype")
    public Mybean createMyBean(){//bean的名字默认是方法的名字,默认
        return new Mybean();
    }

    @Bean
    public CayenneFactoryBean getCayenneFactoryBean(){
        return new CayenneFactoryBean();
    }
}
