package com.li.spring.seconday;

import com.sun.org.apache.bcel.internal.generic.L2D;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor  在每个bean初始化的时候,调用一次
 *
 * @author admin
 */
public class EchoBeanPostProcessor implements BeanPostProcessor {

    @Override
    //是在bean依赖装配(属性设置完后)完成之后出发
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof User) {

            User user = (User) bean;
            user.setSex("女");

            System.out.println(" postProcessBeforeInitialization\t: " + beanName);

            return user;
        }

        return bean;
    }

    @Override
    //init方法执行之后触发的
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof User) {

            System.out.println(" postProcessAfterInitialization\t: " + beanName);

            User l =new LogUser();

            l.setSex("男");
            l.show();

            return l;
        }
        return bean;
    }

    public void show() {

        System.out.println("= .=");
    }
}
