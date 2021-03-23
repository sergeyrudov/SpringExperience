package com.spring.experience.spring_intro.part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigVariant1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigVariant1.class);

        Person person = context.getBean("person", Person.class);
        person.callYourPet();
    }
}
