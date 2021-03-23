package com.spring.experience.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeExample {
    public static void main(String[] args) {
        // Prototype fits for stateful objects
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("prototypeExample.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog == yourDog);
        System.out.println(myDog.getName() + " " + yourDog.getName());
    }
}
