package com.spring.experience.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        /*Animal pet = new Dog();
        Person person = new Person(pet);

        person.callYourPet();*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Animal pet = context.getBean("myPet", Animal.class);

        Person person = new Person(pet);
        person.callYourPet();
        */

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        System.out.println(person.getSurname() + " " + person.getAge());

        context.close();
    }
}
