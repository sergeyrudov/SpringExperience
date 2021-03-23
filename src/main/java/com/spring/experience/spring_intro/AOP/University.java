package com.spring.experience.spring_intro.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Vasiliy Pupkin", 4, 7.5);
        Student st2 = new Student("Mariya Sidorova", 2, 5.1);
        Student st3 = new Student("Mihail Ivanov", 3, 4.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Method getStudents is start");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
