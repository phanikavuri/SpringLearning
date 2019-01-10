package com.phani.helloworld;

import org.springframework.context.annotation.*;

@Configuration
public class HelloworldConfig {
	   @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
	}


