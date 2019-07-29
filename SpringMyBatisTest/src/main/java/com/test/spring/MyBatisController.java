package com.test.spring;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//Controller <-> Service <-> DAO <-> MyBatis(JDBC) <-> Oracle
@Controller
public class MyBatisController {
	
	//의존 객체, 멤버 구현
	@Autowired
	private IMyBatisService service;
	
	//의존 주입 도구 구현
//	public MyBatisController() {
//		this(null);
//	}
//	
//	public MyBatisController(IMyBatisService service) {
//		this.service = service;
//	}
	
	@RequestMapping(value="/test.action", method={RequestMethod.GET})
	public String test(HttpServletRequest req) {
		
		service.test();
		
		return "result";
	}
	
	
	
	
	@RequestMapping(value="/m1.action", method={RequestMethod.GET})
	public String m1(HttpServletRequest req) {
		
		//반환값X, 인자값X -> 정적 쿼리
		service.m1();
		
		return "result";
	}
	
	
	
	
	@RequestMapping(value="/m2.action", method={RequestMethod.GET})
	public String m2(HttpServletRequest req, String seq) {
		
		//반환값X, 인자값O(단일값)
		//int seq = 3; //인자값
		
		int result = service.m2(seq);
		
		req.setAttribute("result", result);
		
		return "result";
	}
	
	
	
	
	
	
	@RequestMapping(value="/m3.action", method={RequestMethod.GET})
	public String m3(HttpServletRequest req, String num, String txt) {
		
		//반환값X, 인자값O(다중값)
		
		//m3.action?num=5&txt=홀수
		//m3.action?num=10&txt=짝수
		//포장 도구
		//1. HashMap
		//2. DTO
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		map.put("txt", txt);
		
		int result = service.m3(map);
		
		req.setAttribute("result", result);
		
		return "result";
	}
	
	
	
	
	@RequestMapping(value="/m4.action", method={RequestMethod.GET})
	public String m4(HttpServletRequest req, MyBatisDTO dto) {
		
		//반환값X, 인자값O(다중값)
		
		//m4.action?num=5&txt=홀수
		//m4.action?num=10&txt=짝수
		//포장 도구
		//1. HashMap
		//2. DTO
		
		int result = service.m4(dto);
		
		req.setAttribute("result", result);
		
		return "result";
	}
	
	
	
	@RequestMapping(value="/m5.action", method={RequestMethod.GET})
	public String m5(HttpServletRequest req) {
		
		//반환값O
		//1. 단일값 반환 : 단일 레코드 + 단일 컬럼 : int or double or String
		//2. 다중값 반환 : 단일 레코드 + 다중 컬럼 : DTO
		//3. 다중값 반환 : 다중 레코드 + 단일 컬럼 : List<String>
		//4. 다중값 반환 : 다중 레코드 + 다중 컬럼 : List<DTO>
		
		int count = service.m5();
		
		req.setAttribute("count", count);
		
		return "result";
	}
	
	
	
	
	
	@RequestMapping(value="/m6.action", method={RequestMethod.GET})
	public String m6(HttpServletRequest req, String num) {
		
		//반환값O
		//1. 단일값 반환 : 단일 레코드 + 단일 컬럼 : int or double or String
		//2. 다중값 반환 : 단일 레코드 + 다중 컬럼 : DTO
		//3. 다중값 반환 : 다중 레코드 + 단일 컬럼 : List<String>
		//4. 다중값 반환 : 다중 레코드 + 다중 컬럼 : List<DTO>
		
		MyBatisDTO dto = service.m6(num);
		
		req.setAttribute("dto", dto);
		
		return "result";
	}
	
	
	
	
	
	@RequestMapping(value="/m7.action", method={RequestMethod.GET})
	public String m7(HttpServletRequest req) {
		
		//반환값O
		//1. 단일값 반환 : 단일 레코드 + 단일 컬럼 : int or double or String
		//2. 다중값 반환 : 단일 레코드 + 다중 컬럼 : DTO
		//3. 다중값 반환 : 다중 레코드 + 단일 컬럼 : List<String>
		//4. 다중값 반환 : 다중 레코드 + 다중 컬럼 : List<DTO>
		
		List<String> blist = service.m7();
		
		req.setAttribute("blist", blist);
		
		return "result";
	}
	
	
	
	@RequestMapping(value="/m8.action", method={RequestMethod.GET})
	public String m8(HttpServletRequest req, String buseo) {
		
		//반환값O
		//1. 단일값 반환 : 단일 레코드 + 단일 컬럼 : int or double or String
		//2. 다중값 반환 : 단일 레코드 + 다중 컬럼 : DTO
		//3. 다중값 반환 : 다중 레코드 + 단일 컬럼 : List<String>
		//4. 다중값 반환 : 다중 레코드 + 다중 컬럼 : List<DTO>
		
		List<MyBatisDTO> list = service.m8(buseo);
		
		req.setAttribute("list", list);
		
		return "result";
	}
	

}
















