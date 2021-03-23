package com.spring.experience.spring_intro.part2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCat")
@Scope("prototype")
public class Cat implements Animal {

    public Cat() {
        System.out.println("cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }


    @PostConstruct
    public void init() {
        System.out.println("cat bean inited");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("cat bean destroyed");
    }
}
