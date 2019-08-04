package com.test.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AOPController {

	@Autowired
	private ICore core;//서비스 객체 & 주업무 객체
	
	@RequestMapping(value="/index.action", method={RequestMethod.GET})
	public String index(HttpServletRequest req) {
		
		//req.setAttribute("num", 100);
		
		//AOP
		// - 주업무와 보조업무를 분리시켜서 관리하자(업무 집중, 재사용, 유지보수성 등등)
		// - Point Cut : 주업무를 지정하는 방법(어떤 클래스.어떤 메소드 : aspectj)
		// - Advice : 보조 업무를 적용하는 형태(Before, After, Around.. x 5종류)
		
		
		//주업무 실행
		int count = core.getCount();
		
		req.setAttribute("count", count);		
		
		return "result";
	}
	
	
	
	@RequestMapping(value="/login.action", method={RequestMethod.GET})
	public String login(HttpServletRequest req, HttpSession session, String id) {
	
		//login.action?id=hong
		//login.action?id=test
		
		//인증 티켓 발급
		session.setAttribute("id", id);
		
		//location.href = "/spring/list.action";
		return "redirect:/list.action"; //resp.sendRedirect()
	}
	
	@RequestMapping(value="/logout.action", method={RequestMethod.GET})
	public String logout(HttpServletRequest req, HttpSession session) {
		
		session.removeAttribute("id");//로그아웃
		return "redirect:/list.action";
	}
	
	@RequestMapping(value="/list.action", method={RequestMethod.GET})
	public String list(HttpServletRequest req, HttpSession session) {
		
		List<DTO> list = core.list();
		
		req.setAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping(value="/view.action", method={RequestMethod.GET})
	public String view(HttpServletRequest req, HttpSession session, String seq, HttpServletResponse resp) {
		
		DTO dto = core.get(seq);
		
		req.setAttribute("dto", dto);
		
		return "view";
	}
	
}
























