package com.example.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio2Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.notificationService.saludar());
    }

}
