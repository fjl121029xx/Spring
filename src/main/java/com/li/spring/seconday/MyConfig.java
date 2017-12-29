package com.li.spring.seconday;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        basePackages = "com.li.spring.seconday",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Book.class})
)
@Configuration
public class MyConfig {

    @Bean
    public EchoBeanPostProcessor createEchoBeanPostProcessor() {

        return new EchoBeanPostProcessor();
    }

}
