package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Spring MVC
// - 서블릿 X
// - 컨트롤러 O
public class Ex02 implements Controller {

	//doGet() /doPost()
	//요청 메소드
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//업무 구현 -> select
		int count = 10;
		String name = "홍길동";
		
		//JSP 호출 + 데이터 전달하기
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex02"); // "/WEB-INF/views/ex02.jsp"
		
		//request.setAttribute("count", count);
		//request.setAttribute("name", name);
		
		mv.addObject("count", count);
		mv.addObject("name", name);
				
		
		return mv;
	}

}










