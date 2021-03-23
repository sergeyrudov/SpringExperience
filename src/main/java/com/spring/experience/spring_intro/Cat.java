package com.spring.experience.spring_intro;

import org.springframework.stereotype.Component;

@Component("catBean")
// if @Component empty - default id is -> cat
// Cat -> cat
// FavoriteSong -> favoriteSong
// SQLTest -> SQLTest
public class Cat implements Pet{

    public Cat() {
        System.out.println("cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}


