package com.spring.experience.spring_intro.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring.experience.spring_intro.AOP")
@EnableAspectJAutoProxy
public class MyConfig {

}
