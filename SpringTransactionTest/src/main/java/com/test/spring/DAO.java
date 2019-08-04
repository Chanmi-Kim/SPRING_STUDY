package com.test.spring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	
	@Autowired
	private SqlSessionTemplate template;

	public int addPoint(String id) {
		
		return template.update("transaction.addPoint", id);
	}

	public int add(DTO dto) {
		
		return template.insert("transaction.add", dto);
	}
	
}





