package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value="/edit.action")
public class Ex06Controller {
	
	@RequestMapping(value="/edit.action")
	public String edit() {
		
		return "ex06";
	}
	
	@RequestMapping(value="/editok.action")
	public String editok() {
		
		return "ex06ok";
	}

}














