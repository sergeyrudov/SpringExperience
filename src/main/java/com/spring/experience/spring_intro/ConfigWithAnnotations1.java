package com.spring.experience.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationContent.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();



        context.close();
    }
}
