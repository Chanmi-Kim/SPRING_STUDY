package com.test.spring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	
	@Autowired
	private SqlSessionTemplate template;

	public int getCount() {
		
		return template.selectOne("board.getCount");
	}

	public List<DTO> list() {
		
		return template.selectList("board.list");
	}

	public DTO get(String seq) {
		
		return template.selectOne("board.get", seq);
	}

	public void log(LogDTO dto) {
		
		template.insert("board.log", dto);		
	}
	
	
}














