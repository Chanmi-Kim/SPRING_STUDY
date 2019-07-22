package com.test.spring.di_7;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config02.xml");
		
		Service service = (Service)context.getBean("service2");
		
		ArrayList<String> list = service.list();
		
		for (String name : list) {
			System.out.println(name);
		}
		
	}

	private static void m2() {
		
		//스프링 + DI 기반으로 구현
		// - XML 역할 : 객체 생성 + 객체간의 관계 형성(***)
		ApplicationContext context = new ClassPathXmlApplicationContext("config02.xml");
		
		IWorker worker = (IWorker)context.getBean("file");
		
		Service service = (Service)context.getBean("service");
		
		//service + worker = 관계 맺기
		service.setWorker(worker); //의존 주입 발생
		
		ArrayList<String> list = service.list();
		
		for (String name : list) {
			System.out.println(name);
		}
		
		
	}

	private static void m1() {

		//Ex07(상사) -> (위임) -> Service(나) -> (위임) -> IWorker(File,DB)
		
		//IWorker worker = new File();
		IWorker worker = new DB();
		
		Service service = new Service(worker);//나, 의존 주입 발생
		
		ArrayList<String> list = service.list();
		
		for (String name : list) {
			System.out.println(name);
		}
		
		
	}

}


















