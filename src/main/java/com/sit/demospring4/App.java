package com.sit.demospring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

       System.out.println("Hello World!");
        

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sit/demospring4/config.xml");

        Emp e1 = context.getBean("emp1", Emp.class);

        System.out.println(e1);
    }
}