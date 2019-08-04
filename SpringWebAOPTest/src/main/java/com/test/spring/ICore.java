package com.test.spring;

import java.util.List;

public interface ICore {

	int getCount();

	List<DTO> list();

	DTO get(String seq);

}
