package com.test.spring.di_3;

import java.util.ArrayList;

public class Ex03_Service {

	public ArrayList<String> list() {
		
		//DAO 역할
		// - 의존 객체(file)
		//Ex03_File file = new Ex03_File(); //해임
		
		//대신 고용
		Ex03_DB db = new Ex03_DB();
		
		//ArrayList<String> list = file.list();
		ArrayList<String> list = db.list();
		
		//조작 구현 추가
		
		return list;
	}

}








