package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex08Controller {

	@RequestMapping(value="/ex08.action")
	public String ex08() {
		
		return "ex08";
	}
	
	//doPost
	@RequestMapping(value="/ex08ok.action", method={RequestMethod.POST})
	public void ex08ok() {
		
		System.out.println("데이터 전송 받아 처리함. - POST");
	}
	
	//doGet
	@RequestMapping(value="/ex08ok.action", method={RequestMethod.GET})
	public void ex08ok2() {
		
		System.out.println("데이터 전송 받아 처리함. - GET");
	}
	
}










