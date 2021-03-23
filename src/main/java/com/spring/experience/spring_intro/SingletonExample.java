package com.spring.experience.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonExample {
    public static void main(String[] args) {
        // singletone bean example, default scope. This bean created after spring container read the xml file.
        // bean is the same for all requests
        // Fits for stateless bean
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("singletonExample.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog == yourDog);
        System.out.println(myDog.getName() + " " + yourDog.getName());

        context.close();


    }
}
