package com.test.spring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

	//의존 객체
	@Autowired
	private SqlSessionTemplate template;

	public List<BoardDTO> list() {
		
		//select
		//1. selectOne : 결과셋 레코드 1줄
		//2. selectList : 결과셋 레코드 여러줄
		return template.selectList("board.list");
	}

	public BoardDTO get(String seq) {
		
		return template.selectOne("board.get", seq);
	}
	
	public int add(BoardDTO dto) {
		return template.insert("board.add", dto);
	}
	
}
