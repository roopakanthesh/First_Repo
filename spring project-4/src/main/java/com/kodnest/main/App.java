package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;

public class App {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Trainer bean1 = (Trainer) context.getBean("t");
		System.out.println(bean1);
		University bean2 = (University) context.getBean("u1");
		System.out.println(bean2);
	}

}

