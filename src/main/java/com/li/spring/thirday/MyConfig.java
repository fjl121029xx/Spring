package com.li.spring.thirday;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(initMethod = "init")
    public User createUser(){

        return new User();
    }
}
