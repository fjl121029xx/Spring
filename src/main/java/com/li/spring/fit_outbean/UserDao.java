package com.li.spring.fit_outbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void select(){

        System.out.println(" userDao select ");
    }
}
