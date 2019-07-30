package com.test.spring;

import java.util.List;

public interface IBoardService {

	List<BoardDTO> list();

	BoardDTO get(String seq);

	int add(BoardDTO dto);

}
