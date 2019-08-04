package com.test.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class DTO {

	private String seq;
	private String name;
	private String pw;
	private String subject;
	private String content;
	private String regdate;
	
}
