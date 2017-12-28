package com.li.spring.firstday;

import com.li.spring.firstday.beanInit_destory.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

    //Bean的初始化 第二种方式 自己声明init,destory方法
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Dog createDog() {

        return new Dog();
    }
}
