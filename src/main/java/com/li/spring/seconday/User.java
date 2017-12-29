package com.li.spring.seconday;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
public class User implements InitializingBean, DisposableBean {

    private AnnotationConfigApplicationContext context;

    private String sex;

    public void init() {

        System.out.println(" user init ");
    }

    public void show() {

        System.out.println("User : " + context.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        if (this.getSex().equals("女")) {

            System.out.println("papapa~!");
        }
        System.out.println(" user init ");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println(" user detory ");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void say() {

        if (sex.equals("女")) {

            System.out.println("啊!人家是妹子嘛~!");
        } else {

            System.out.println("臭不要脸");
        }
    }
    @Autowired
    public void setContext(AnnotationConfigApplicationContext context) {
        this.context = context;
        System.out.println("setContext");
    }
}
