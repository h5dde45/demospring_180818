package com.example.objects.main;

import com.example.objects.robots.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");


        ModelT1000 robot = (ModelT1000) context.getBean("t1000");
        System.out.println(robot);
        System.out.println(robot.getHead());
        System.out.println(robot.getHand());

        robot = (ModelT1000) context.getBean("t1000");
        System.out.println(robot);
        System.out.println(robot.getHead());
        System.out.println(robot.getHand());

        robot = (ModelT1000) context.getBean("t1000");
        System.out.println(robot);
        System.out.println(robot.getHead());
        System.out.println(robot.getHand());


    }
}
