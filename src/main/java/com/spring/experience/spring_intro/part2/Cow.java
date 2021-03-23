package com.spring.experience.spring_intro.part2;

import org.springframework.stereotype.Component;

@Component("myCows")
public class Cow implements Animal {

    public Cow() {
        System.out.println("Cow bean is created");
    }

    @Override
    public void say() {
        System.out.println("Mooo");
    }
}
