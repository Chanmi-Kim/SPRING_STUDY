package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//컨트롤러 역할(전체 업무 흐름 잡아주는 역할)
		//메모 업무 > Memo 객체에게 위임
		
		//Memo memo = new Memo();
		//memo.xxx();
		
		ApplicationContext context = new ClassPathXmlApplicationContext(".\\com\\test\\spring\\aop\\memo.xml");
		
		IMemo memo = (IMemo)context.getBean("memo");
		//System.out.println(memo == null);
		
		//1. 주업무 실행 - 메모 쓰기
		memo.add("메모를 작성합니다.");
		
		//메모 수정하기
		memo.edit("수정합니다.");
		
		//메모  삭제하기
		memo.del(5);
		
		//메모 읽기
		try {
			memo.read(5);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("관리자 연락 요망");
		}
		
		
		//검색
		int seq = memo.search("메모");
		
		System.out.printf("%s번 메모에서 검색됨\n", seq);
		
	}

}












