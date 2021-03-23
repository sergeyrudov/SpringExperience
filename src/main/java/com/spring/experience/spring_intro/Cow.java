package com.spring.experience.spring_intro;

import org.springframework.stereotype.Component;

@Component("myCow")
public class Cow implements Pet {

    @Override
    public void say() {
        System.out.println("Mooo");
    }

    public Cow() {
        System.out.println("Cow bean is created");
    }


    public void init() {
        System.out.println("Class cow: init method");
    }

    public void destroy() {
        System.out.println("Class cow: destroy method");
    }
}
