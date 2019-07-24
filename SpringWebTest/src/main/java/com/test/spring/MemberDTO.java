package com.test.spring;

import lombok.Getter;
import lombok.Setter;


//@Getter @Setter @ToString
//@Data //@Getter @Setter @ToString + equals() + hashCode()
public class MemberDTO {

	@Getter
	private String name;
	
	@Setter
	private int age;
	private String nick;
	
}







