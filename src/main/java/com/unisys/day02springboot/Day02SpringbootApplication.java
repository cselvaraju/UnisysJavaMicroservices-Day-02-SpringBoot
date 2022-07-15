package com.unisys.day02springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.unisys.JSR.Welcome;

@SpringBootApplication
@ComponentScan(basePackages="com.unisys.day02springboot, com.unisys.JSR")
public class Day02SpringbootApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day02SpringbootApplication.class, args);
		
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String name : beanNames) {
			System.out.println("======> Bean: " + name);
		}
//		GradStudent s = (GradStudent) context.getBean("gradStudent");
//		System.out.println(s);
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation-config.xml");
//		Student s = (Student) ctx.getBean("myStudent");
//		System.out.println(s);
		
		Welcome welcome = (Welcome) context.getBean("welcome");
		welcome.showWelcomeMessage();
		
		DataAnalytics da = (DataAnalytics) context.getBean("dataAnalytics");
		da.getData();
	}

}
