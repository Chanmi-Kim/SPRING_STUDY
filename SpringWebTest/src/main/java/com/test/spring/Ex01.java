package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//서블릿 역할
//기존의 컨트롤러(서블릿)과 차이점
//1. 선언 방식
//		a. Controller 인터페이스 구현
//		b. @Controller 어노테이션 사용
public class Ex01 implements Controller {

	//2. handleRequest
	// - doGet/doPost 메소드 역할
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		//3. 비즈니스 코드 구현
		
		//4. JSP 호출(뷰 호출)
		// - RequestDispatcher 사용 : 이전 방식
		// - ModelAndView 사용 : 현재 방식
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex01");
		
		return mv; //JSP 호출
	}

}













