package com.test.spring;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemoController {
	
	private IMemo dao;
	
	public MemoController() {
		this.dao = new MemoDAO();
	}
	
	//템플릿 작업
	@RequestMapping(value="/template.memo", method= {RequestMethod.GET})
	public String template(HttpServletRequest req) {
		
		return "template";
	}
	
	
	
	//메모 쓰기
	@RequestMapping(value="/add.memo", method= {RequestMethod.GET})
	public String add(HttpServletRequest req) {
		
		return "add";
	}
	
	
	//메모 쓰기
	@RequestMapping(value="/addok.memo", method= {RequestMethod.POST})
	public String addok(HttpServletRequest req, MemoDTO dto) {
		
		//1. 데이터가져오기
		//2. DAO 위임 > insert
		//3. 결과 반환 + JSP 호출
		
		int result = dao.add(dto);
		
		req.setAttribute("result", result);
		
		return "addok";
	}
	
	
	
	//시작 & 목록
	@RequestMapping(value = "/index.memo", method = { RequestMethod.GET })
	public String index(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		//1. DAO 위임 > select
		//2. 결과 반환 + JSP 호출
		
		List<MemoDTO> list = dao.list();
		
		req.setAttribute("list", list);

		return "index";
	}
	
	@RequestMapping(value = "/edit.memo", method = { RequestMethod.GET })
	public String edit(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String seq) {

		//1. 데이터 가져오기(seq)
		//2. DAO 위임 > select where
		//3. 결과 반환 + JSP 호출
		
		MemoDTO dto = dao.get(seq);
		
		req.setAttribute("dto", dto);

		return "edit";
	}
	
	
	@RequestMapping(value = "/editok.memo", method = { RequestMethod.POST })
	public String editok(HttpServletRequest req, HttpServletResponse resp, HttpSession session, MemoDTO dto) {

		int result = dao.edit(dto);
		
		req.setAttribute("result", result);

		return "editok";
	}
	
	
	@RequestMapping(value = "/delok.memo", method = { RequestMethod.GET })
	public String delok(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String seq) {

		//1. 데이터 가져오기(seq)
		//2. DAO 위임 > delete
		//3. 결과 반환 + JSP 호출
		
		int result = dao.del(seq);
		
		req.setAttribute("result", result);

		return "delok";
	}


}












