package com.test.spring.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//보조 업무 객체
// - 주업무 코드와 보조업무 코드를 분리시키고 + 재사용하는 것이 목적
public class Logger {

	//보조 업무 구현
	//1. 지금 구현하는 보조업무를 주업무와 관련해서 어느 시점에 실행할 것인가?
	
	//Around Advice 구현
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		//보조업무
		long start = System.currentTimeMillis();
		System.out.println("[log] 시간 기록을 시작합니다.");
		
		//주업무 실행(메모 쓰기) - 가상 참조
		try {
			
			//memo.add("") 참조
			joinPoint.proceed();
			
		} catch (Exception e) {
			System.out.println("Logger.around : " + e.toString());
		}
		
		
		//보조업무
		long end = System.currentTimeMillis();
		System.out.println("[log] 시간 기록을 종료합니다.");
		System.out.printf("[log] 주업무 실행 소요 시간 : %s\n", end - start + "ms");
		
	}
	
	
	//Before Advice 구현
	public void before() {
		
		//시간 기록
		System.out.printf("[log] %tT\n", Calendar.getInstance());
		
	}
	
	
	private int count = 0;//총 누적회
	
	//After Advice 구현
	public void after() {
		//주 업무가(포인트 컷) 총 몇회 실행됐는지 기록
		count++;
		System.out.printf("[log] 주업무 실행 횟수 : %d회\n", count);
	}
	
	
	
	//After Throwing Advice 구현
	// - 주업무 실행 중 예외가 발생하면 같이 실행해야 할 보조 업무
	// - 예외처리X
	public void afterthrowing(Exception e) {
		
		//관리자에게 자동으로 메일 발송
		System.out.printf("[log] '%s' 예외 발생으로 관리자에게 메일을 발송했습니다.\n"
										, e.getMessage());
		
	}
	
	
	//After Returning Advice
	public void afterreturning(Object obj) {
		
		System.out.printf("[log] %s번 메모 검색됨\n", obj);
	}
	
	
	
}


















