package com.phani.helloworld;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

//      objA.setMessage("I'm object A");
////      objA.getMessage();
//
////      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
////      objB.getMessage();
      
      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage();
      objB.getMessage1();
      context.registerShutdownHook();
   }
}