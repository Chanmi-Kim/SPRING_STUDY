package com.test.spring.di_4;

import java.util.ArrayList;

//Service(나) <-> (연결고리) <-> 최종 실무자(File,DB)
public interface IWorker {
	
	//추상 메소드 : Service(나)가 최종 실무자에게 시킬 업무 메소드
	ArrayList<String> list();
	
}
