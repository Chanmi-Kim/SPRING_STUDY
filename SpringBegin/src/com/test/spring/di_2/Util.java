package com.test.spring.di_2;

import java.util.Scanner;

public class Util {
	
	//주입당한 의존 객체를 유지하기 위해서 만든다.
	private Scanner scan;
	
	//DI, Dependency Injection
	// - Util 객체에게 반드시 필요한 의존객체(scan)를 외부로부터 주입받는 방식
	
	//DI 구현 방식
	//1. 생성자 사용 + 멤버 변수 구현
	//2. setter 사용 + 멤버 변수 구현
	//public Util(Scanner scan) {
		//원래 구현해야 할 생성자 업무 구현
		// + a : 의존 주입(DI) 구현
	//	this.scan = scan;
	//}
	
	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	//public String getName(Scanner scan) {
	public String getName() {
		
		//Util의 의존객체
		// *** 우리가 여태껏 작업했던 패턴 : 의존 객체가 필요하면 필요한 당사자가 직접 스스로 생성해서 + 사용
		//Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = scan.nextLine();
		
		return name;
	}
	
}




















