package com.spring.experience.spring_intro.part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigVariant2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigVariant2.class);

        Animal cat1 = context.getBean("catBean", Animal.class);
        Animal cat2 = context.getBean("catBean", Animal.class);
        System.out.println(cat1 == cat2);


        // person created with dependency injection -> animal
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname() + " " + person.getAge());

    }
}
