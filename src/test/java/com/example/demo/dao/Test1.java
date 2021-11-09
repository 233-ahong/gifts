package com.example.demo.dao;

import com.example.demo.domain.Admin;
import com.example.demo.service.IAdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IAdminService adminServiceImpl = (IAdminService) context.getBean("AdminServiceImpl");
        for (Admin admin : adminServiceImpl.findAll()) {
            System.out.println(admin);
        }
    }
}
