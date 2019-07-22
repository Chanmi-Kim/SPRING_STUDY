package com.test.spring.di_5;

import java.util.ArrayList;

public class Ex03_Service {
	
	//DI 구현 방법
	//1. 생성자
	//2. setter
	
	private IWorker worker;
	
	public Ex03_Service(IWorker worker) { //의존 객체 주입(DI)
		this.worker = worker;
	}

	public ArrayList<String> list() {
		
		//현재 상태] 의존 객체를 스스로 생성해서 사용하는 중 > DI 구현으로 변경
		//IWorker worker = new Ex03_File();
		//IWorker worker = new Ex03_DB();
		ArrayList<String> list = worker.list();
		
		return list;
	}

}








