package com.spring.experience.spring_intro.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationQualifierExample.xml");



        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname() + " " + person.getAge());




    }
}
