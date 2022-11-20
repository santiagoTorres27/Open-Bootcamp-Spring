package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

        StudentRepository repository = context.getBean(StudentRepository.class);

        Student student1 = new Student(null, "Juan", "Alvarez", 34);
        Student student2 = new Student(null, "Alejandra", "Rodriguez", 30);
        repository.save(student1);
        repository.save(student2);

        System.out.println(repository.count());
    }

}
