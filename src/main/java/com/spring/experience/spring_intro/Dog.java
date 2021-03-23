package com.spring.experience.spring_intro;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("bow-wow");
    }

    public void init() {
        System.out.println("Class dog: init method");
    }

    public void destroy() {
        System.out.println("Class dog: destroy method");
    }
}
