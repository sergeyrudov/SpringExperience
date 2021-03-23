package com.spring.experience.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyTest {
    public static void main(String[] args) {

        // if bean type is prototype, destroy method is not called
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("initDestroyConfig.xml");

        Cow myCow = context.getBean("myCow", Cow.class);
        myCow.say();

        Cow yourCow = context.getBean("myCow", Cow.class);
        yourCow.say();

        context.close();


    }
}
