package com.li.spring.thirday;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * MyBeanFactoryPostProcessor在Spring容器初始化之后只会触发一次
 * 触发的时机比BeanPostProcessor早
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println(beanFactory.getBeanDefinitionCount());
        System.out.println(beanFactory.getBeanPostProcessorCount());
    }
}
