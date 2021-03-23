package com.spring.experience.spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    // spring container searching for annotation @Components, than searching for @Autowired any tries to apply dependency, of constructor, setter, any method or field
    //@Autowired // dependency injection, made with java reflection
    //@Qualifier("catBean") // select dog bean
    private Pet pet;
    private String surname;
    private int age;

    /*@Autowired // optional
    public Person(Animal pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

    public Person() {
        System.out.println("Person bean is created");
    }

    //@Autowired
    // pet -> setPet
    /*public void anyNameMethod(Animal pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }*/

    @Autowired
    @Qualifier("myCow")
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
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
        System.out.println("Hello my pet");
        pet.say();
    }


}
