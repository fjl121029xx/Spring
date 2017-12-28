package com.li.spring;

import com.li.spring.beanInit_destory.Cat;
import com.li.spring.beanInit_destory.Dog;
import com.li.spring.fit_outbean.UserDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        basePackages = "com.li.spring",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {MyConfig.class, UserDao.class}))
@Configuration
public class AnnotationScan {


}
