package com.test.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//보조 업무 객체
@Aspect //보조 업무 객체 자격
@Component //의존 주입 객체 자격
public class Cross {

	//주업무 지정 > 포인터 컷 지정
	@Pointcut("execution(public int com.test.spring.Core.getCount())")
	public void pc1() {}
	
	
	//보조 업무
	@After("pc1()")
	public void m1() {
		System.out.println("보조업무가 실행되었습니다.");
	}
	
}












