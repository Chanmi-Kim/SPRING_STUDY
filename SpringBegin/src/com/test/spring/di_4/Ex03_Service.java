package com.test.spring.di_4;

import java.util.ArrayList;

public class Ex03_Service {

	public ArrayList<String> list() {
		
		//내가 의존하는 객체 > 같은 Role 을 가지면 > 행동도 동일하게 할 수 있게 제약
		// IWorker.java
		//1. Ex03_File
		//2. Ex03_DB
		
		//DAO 역할
		// - 의존 객체(file)
		//Ex03_File file = new Ex03_File(); //해임
		//대신 고용
		//Ex03_DB db = new Ex03_DB();
		
		//ArrayList<String> list = file.list();
		//ArrayList<String> list = db.list();
		
		//인터페이스 구현 객체 > 참조 변수를 되도록 인터페이스 타입으로 만들어라. ?
		//Ex03_File file = new Ex03_File();//X
		
		
		
		
		//Ex03_File file = new Ex03_File();//O
		//ArrayList<String> list = file.list();
		
		//Ex03_DB db = new Ex03_DB();
		//ArrayList<String> list = db.list();
		
		
		//인터페이스로 만든 변수명은 추상화된 이름을 사용한다.
		//IWorker worker = new Ex03_File();//O
		//ArrayList<String> list = worker.list();
		
		IWorker worker = new Ex03_DB();
		ArrayList<String> list = worker.list();
		
		//조작 구현 추가
		
		return list;
	}

}








