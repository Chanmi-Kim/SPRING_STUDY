package com.test.spring.di_4;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		//[관계]
		//Ex02 -> (위임) -> Util -> (위임) -> Scanner
		//Ex03 -> (위임) -> Service -> (위임) -> File or DB
		
		//[업무 데이터]
		//1. 파일 데이터 > (전환) > 2. DB 데이터
		
		//업무 > 데이터소스의 이름 명단을 가져와서 화면에 출력
		
		Ex03_Service service = new Ex03_Service();
		
		ArrayList<String> list = service.list();
		
//		View view = new View();
//		view.print(list);
		
		//뷰 역할
		for (String name : list) {
			System.out.println(name);
		}
		
	}
	
}








