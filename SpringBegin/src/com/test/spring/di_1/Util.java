package com.test.spring.di_1;

import java.util.Scanner;

public class Util {

	public String getName() {
		
		//Util의 의존객체 -> scan
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = scan.nextLine();
		
		return name;
	}
	
}




















