package com.li.spring.seconday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author admin
 */
@Component
public class User {

    @Autowired
    private AnnotationConfigApplicationContext context;

    public void show() {

        System.out.println("User : " + context.getClass());
    }

}
