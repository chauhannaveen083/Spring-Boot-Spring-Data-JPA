package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//day1: @Annotaions and environment practice
       //needed if we want to active a specific environment
//		var app=new SpringApplication(Application.class);
//		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
//		var ctx=app.run(args);
//		MyFirstService myFirstService=ctx.getBean(MyFirstService.class);

//		System.out.println(myFirstService.tellStory());
//		System.out.println(myFirstService.getJavaVersion());
//		System.out.println(myFirstService.getCustomPropFromAnotherFile());
//		System.out.println(myFirstService.getCustom());
//		System.out.println(myFirstService.getCustomInt());

		//day2: Spring Rest

		SpringApplication.run(Application.class,args);


	}

	}
