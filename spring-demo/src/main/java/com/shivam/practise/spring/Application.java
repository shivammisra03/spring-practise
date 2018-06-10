package com.shivam.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
		
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		triangle.draw();
		
	}

}
