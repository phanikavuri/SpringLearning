package com.phani.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class TestAnnotationApp {
	  public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(HelloworldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello World!");
	      helloWorld.getMessage();
	   }
	}




 