package com.test.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Core implements ICore {

	@Autowired
	private DAO dao;
	
	
	//주업무 객체!!!!! + 주업무 메소드
	@Override
	public int getCount() {
		
		return dao.getCount();
	}
	
	
	@Override
	public List<DTO> list() {
		
		return dao.list();
	}
	
	@Override
	public DTO get(String seq) {
		
		return dao.get(seq);
	}
	
}












