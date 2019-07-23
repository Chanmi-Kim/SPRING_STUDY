package com.test.spring.aop;

public interface IMemo {
	
	//1. 주업무 실행 - 메모 쓰기
	void add(String memo);
	
	//2. 주업무 실행 - 메모 읽기
	void read(int seq) throws Exception;
	
	//3. 주업무 실행 - 메모 수정하기
	void edit(String memo);
	
	//4. 주업무 실행 - 메모 삭제하기
	void del(int seq);
	
	//5. 주업무 실행 - 메모 검색하기
	int search(String word);

}







