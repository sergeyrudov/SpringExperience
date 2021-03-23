package com.spring.experience.spring_intro.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationQualifierExample.xml");

        // singleton objects
        /*Dog myDog1 = context.getBean("myDog", Dog.class);
        Dog myDog2 = context.getBean("myDog", Dog.class);

        System.out.println(myDog1 == myDog2);
*/
        Animal cat1 = context.getBean("myCat", Cat.class);

        cat1.say();

        context.close();

    }
}
