package com.li.spring.seconday;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * bean的后置处理器
 */
@Component
public class ContextBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private ApplicationContext context;

    @Override
    //是在bean依赖装配(属性设置完后)完成之后出发
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof SpringContextAware) {

            SpringContextAware sca = (SpringContextAware) bean;
            sca.setApplicationContext(context);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }
}
