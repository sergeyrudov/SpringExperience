package com.spring.experience.spring_intro.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Vasiliy", book);
        uniLibrary.addMagazine();
        /*uniLibrary.returnMagazine();
        uniLibrary.addBook();

        // uniLibrary.returnBook();


        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();*/

        context.close();
    }
}
