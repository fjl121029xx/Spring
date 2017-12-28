package com.li.spring.firstday.fit_outbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class UserService {

    @Autowired
    /*@Qualifier("userDao")*/
    private UserDao userDao;
    //JSR-250
    @Resource
    private User user;
    //JSR-330
    @Inject
    private UserController userController;

    public void select() {

        userDao.select();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                ", user=" + user +
                ", userController=" + userController +
                '}';
    }
}
