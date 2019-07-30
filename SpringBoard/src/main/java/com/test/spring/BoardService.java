package com.test.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements IBoardService {
	
	//의존 객체
	@Autowired
	private BoardDAO dao;

	@Override
	public List<BoardDTO> list() {
		
		List<BoardDTO> list = dao.list();
		
		return list;
	}

	@Override
	public BoardDTO get(String seq) {
		
		BoardDTO dto = dao.get(seq);
		
		return dto;
	}

	
	@Override
	public int add(BoardDTO dto) {
		
		return dao.add(dto);
	}
	
}









