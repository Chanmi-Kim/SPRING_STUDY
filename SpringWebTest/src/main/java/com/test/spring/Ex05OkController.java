package com.test.spring;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/addok.action")
public class Ex05OkController {

	@RequestMapping
	public String addok(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
		
		//1. 데이터 가져오기
		//2. DB 업무
		//3. 결과
		//4. JSP 호출
		
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String subject= req.getParameter("subject");
		String name = req.getParameter("name");
		
		System.out.println(subject);
		System.out.println(name);
		
		int result = 1;
		
		req.setAttribute("result", result);
		
		return "ex05ok";
	}
	
}













