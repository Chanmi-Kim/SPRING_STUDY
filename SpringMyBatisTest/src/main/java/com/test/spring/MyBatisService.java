package com.test.spring;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//의존 객체 명시 + 서비스 업무 담당
@Service //DI 자격
public class MyBatisService implements IMyBatisService {
	
	@Autowired
	private MyBatisDAO dao;

	@Override
	public void test() {
		System.out.println("테스트");
	}
	
	@Override
	public void m1() {
		
		dao.m1();
	}
	
	@Override
	public int m2(String seq) {
		
		return dao.m2(seq);
	}
	
	@Override
	public int m3(HashMap<String, String> map) {
		
		return dao.m3(map);
	}
	
	@Override
	public int m4(MyBatisDTO dto) {
		
		return dao.m4(dto);
	}
	
	@Override
	public int m5() {
		
		return dao.m5();
	}
	
	@Override
	public MyBatisDTO m6(String num) {
		
		return dao.m6(num);
	}
	
	@Override
	public List<String> m7() {
		
		return dao.m7();
	}
	
	@Override
	public List<MyBatisDTO> m8(String buseo) {
		
		return dao.m8(buseo);
	}
	
}



















