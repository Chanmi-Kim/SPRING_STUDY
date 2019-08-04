package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Autowired
	private DAO dao;
	
	//1. 포인트 컷 지정
	//2. 보조업무 구현 + Advice 적용
	
	//list.action
	//view.action
	//add.action
	//del.action
	//edit.action
	// -> AOPController.*(..)
	
	
	//list.action
	//view.action
	//madd.action
	//mdel.action
	//medit.action
	// -> AOPController.m*(..)
	
	
	
	//1.
	@Pointcut("execution(public String AOPController.list(..)) || execution(public String AOPController.view(..))")
	public void pc1() {}
	
	//2.
	@After("pc1()")
	public void log(JoinPoint joinPoint) {
		
		Object[] args = joinPoint.getArgs();
		
		HttpServletRequest req = (HttpServletRequest)args[0];
		HttpSession session = (HttpSession)args[1];
		
		//System.out.println(req.getRequestURL());
		//System.out.println(session.getAttribute("id") == null ? "익명" : session.getAttribute("id").toString());
		
		LogDTO dto = new LogDTO();
		dto.setUrl(req.getRequestURL().toString());
		dto.setId(session.getAttribute("id") == null ? "" : session.getAttribute("id").toString());
		
		dao.log(dto);
		
	}
	
	

}






















