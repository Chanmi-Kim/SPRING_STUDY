package com.test.spring.di_7;

import java.util.ArrayList;

//나 -> 의존객체(IWorker) 주입
public class Service {
	
	private IWorker worker;//의존 객체 변수
	
	public Service() {
		//스프링 DI에 적용되기 위해서..
		this(null);
	}
	
	public Service(IWorker worker) { //의존 주입 도구(생성자)
		this.worker = worker;
	}
	
	public void setWorker(IWorker worker) { //의존 주입 도구(setter)
		this.worker = worker;
	}

	public ArrayList<String> list() {
		
		return this.worker.list();
	}


}









