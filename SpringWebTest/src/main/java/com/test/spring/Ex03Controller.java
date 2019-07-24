package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Ex03Controller implements Controller {
	
	//잘 쓰고 있던 의존 객체를 DI 구현라고 시켰다..
	//1. 멤버 변수로 만든다.
	private SpringDAO dao;
	private int a;
	
	//2. 주입 도구 선택 > 만든다.
	public Ex03Controller() {
		this(null);
	}
	public Ex03Controller(SpringDAO dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//DAO
		//SpringDAO dao = new SpringDAO();
		int count = dao.getCount();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex03");
		
		mv.addObject("count", count);
		
		return mv;
	}
	
}







