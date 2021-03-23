package com.spring.experience.spring_intro.part2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Animal {

    private String name;

    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("bow-wow");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
