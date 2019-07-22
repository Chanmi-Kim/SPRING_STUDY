package com.test.spring.di_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//Student 객체 생성 + 스프링 사용
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("config01.xml");
		
		//<bean id="s1" class="com.test.spring.di_06.Student"></bean>
		//홍길동
		//아무개
		Student s1 = (Student)context.getBean("s1");
		s1.setName("홍길동");
		s1.setAge(20);
		System.out.println(s1.getName() + ", " + s1.getAge());
		
		
		Student s2 = (Student)context.getBean("s2");
		System.out.println(s2.getName() + ", " + s2.getAge());
		
		
		Student s3 = (Student)context.getBean("s3");
		System.out.println(s3.getName() + ", " + s3.getAge());
		
		Student s4 = (Student)context.getBean("haha");
		System.out.println(s4.getName() + ", " + s4.getAge());
		
		
	}

	private static void m2() {
		
		//Student(의존) 객체가 필요
		// -> 스프링을 사용한 처리
		// -> XML 파일을 통해 처리
		//SpringBegin > src > config01.xml //위치와 이름 > 자유
		
		//스프링 설정 파일 읽기(config01.xml)
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("config01.xml");
		
		//bean == 객체(인스턴트)
		//<bean> == new Student() //동등
		//<bean id="s1" class="com.test.spring.di_06.Student"></bean>
		
		Student s1 = (Student)context.getBean("s1");//return new Student();
		
		s1.setName("아무개");
		s1.setAge(25);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
	}

	private static void m1() {
		
		//Ex06 -> (의존) -> Student
		//예전 방식 : 필요하면 직접 만들어서 사용
		Student s1 = new Student(); //의존 객체
		
		s1.setName("홍길동");
		s1.setAge(20);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
	}

}



















