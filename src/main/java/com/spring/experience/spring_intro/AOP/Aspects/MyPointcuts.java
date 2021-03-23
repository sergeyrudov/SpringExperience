package com.spring.experience.spring_intro.AOP.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}
