package com.test.spring.di_6;

public class Student {
	
	private String name;
	private int age;
	
	public Student() { //반드시 필수
		//this.name = "";
		//this.age  = 0;
		this("", 0);
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
