package com.example.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio1Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");
        System.out.println(saludo.imprimirSaludo());
    }

}
