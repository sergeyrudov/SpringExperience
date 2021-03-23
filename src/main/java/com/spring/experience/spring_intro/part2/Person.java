package com.spring.experience.spring_intro.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    // first variant
    /*@Autowired - implements dependency injection via field
    @Qualifier("myCows") - select myCows bean from available cat, dog, and cow*/
    private Animal animal;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


    @Autowired // second variant via constructor
    public Person(@Qualifier("myCat") Animal animal) {
        this.animal = animal;
    }

    // third variant work with setter
    //@Autowired // implement dependency injection
    //@Qualifier("myCows") // from 3 beans, cow dog and cat, select myCows
    public void setPet(Animal animal) {
        System.out.println("Class person: set animal");
        this.animal = animal;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my animal");
        animal.say();
    }
}
