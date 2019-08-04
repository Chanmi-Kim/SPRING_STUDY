package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TService implements ITService {
	
	@Autowired
	private DAO dao;
	
	//스프링 트랙잭션은 메소드 단위로 지원한다.
	@Override
	@Transactional
	public int add(DTO dto) {
		
		//글쓰기 & 포인트 증가
		int result = 0;
		
		result += dao.addPoint(dto.getId());
		
		result += dao.add(dto);
		
		return result;
	}
	
}











