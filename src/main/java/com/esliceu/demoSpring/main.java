package com.esliceu.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//Cojemos el bean que hay en la application.xml
        Person tom=(Person) context.getBean("tom");
    }
}
