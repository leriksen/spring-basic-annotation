package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springinaction.knights")
public class RunKnights {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(RunKnights.class);

        Knight knight = context.getBean(Knight.class);

        knight.embarkOnQuest();
    }
}
