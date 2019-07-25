package com.test.spring;

import java.util.List;

public interface IMemo {

	int add(MemoDTO dto);

	List<MemoDTO> list();

	MemoDTO get(String seq);

	int edit(MemoDTO dto);

	int del(String seq);

}
