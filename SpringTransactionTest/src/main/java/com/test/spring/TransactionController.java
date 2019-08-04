package com.test.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransactionController {
	
	/* 
	1. hong - 포인트 확인
	2. 글쓰기 - 오버플로우 발생
	3. hong - 포인트 그대로 확인
	4. 글쓰기 - 정상
	5. hong - 포인트 +10 증가 확인	 
	 */
	
	@Autowired
	private ITService service;

	@RequestMapping(value = "/add.action", method = { RequestMethod.GET })
	public String add(HttpServletRequest req) {

		return "add";
	}
	
	@RequestMapping(value = "/addok.action", method = { RequestMethod.POST })
	public String addok(HttpServletRequest req, DTO dto) {
		
		int result = service.add(dto);

		req.setAttribute("result", result);
		
		return "addok";
	}
	
}











