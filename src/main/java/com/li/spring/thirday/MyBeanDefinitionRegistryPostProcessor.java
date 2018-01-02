package com.li.spring.thirday;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor可以拿到ConfigurableListableBeanFactory,BeanDefinitionRegistry两个对象
 * BeanDefinitionRegistry 可以动态注入bean
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    //一次性注入10个bean
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        for (int i = 0; i < 10; i++) {

            BeanDefinitionBuilder beanBuild = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            beanBuild.addPropertyValue("name", "jianailiang" + i);
            registry.registerBeanDefinition("person" + i, beanBuild.getBeanDefinition());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
