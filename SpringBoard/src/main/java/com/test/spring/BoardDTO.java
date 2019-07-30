package com.test.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BoardDTO {

	private String seq;
	private	String name;
	private String pwd;
	private String subject;
	private String content;
	private String regdate;
	
}
