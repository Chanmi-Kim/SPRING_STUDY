package com.test.spring.di_2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//업무 구현
		//Util util = new Util();
		//String name = util.getName();
		//System.out.println("안녕~ " + name);
		
		
		
		
		
		
		//Scanner scan = new Scanner(System.in);
		
		//Util util = new Util();
		//String name = util.getName(scan); //1. DI 발생
		//System.out.println("안녕~ " + name);
		
		
//		Scanner scan = new Scanner(System.in);
//		Util util = new Util(scan); //2. DI 발생
//		String name = util.getName();
//		System.out.println(name);
		
		
		Scanner scan = new Scanner(System.in);
		Util util = new Util(); 
		util.setScan(scan);//3. DI 발생
		String name = util.getName();
		System.out.println(name);
		
		
		
	}
	
}
















