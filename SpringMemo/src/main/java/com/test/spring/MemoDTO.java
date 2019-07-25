package com.test.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MemoDTO {

	private String seq;
	private String name;
	private String memo;
	private String regdate;
	private String category;
	
}
