package com.test.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex07Controller {
	
	//Ambiguous mapping found. Cannot map 'ex07Controller' bean method 
	@RequestMapping(value="/address/add.action")
	public String add() {
		
		return "ex07";
	}
	
	//스프링 MVC : 전송된 데이터를 받아오는 방법
	@RequestMapping(value="/address/addok.action")
	public String addok(
										HttpServletRequest req, 
										//String name,
										//String age,
										//String address,
										//String tel,
										//String email
										AddressDTO dto,
										String seq
										) {
		
		System.out.println(seq);
		//String seq = req.getParameter("seq");
		
		//1. 데이터 가져오기
		//2. DTO 포장
		//3. DAO 호출 + insert : 생략
		//4. 마무리
		
		//방법1. 기존 방식
//		String name = req.getParameter("name");
//		String age = req.getParameter("age");
//		String address = req.getParameter("address");
//		String tel = req.getParameter("tel");
//		String email = req.getParameter("email");
//		
//		AddressDTO dto = new AddressDTO();
//		
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//		dto.setTel(tel);
//		dto.setEmail(email);
		
		
		//방법2. 요청 메소드의 매개변수 사용
//		AddressDTO dto = new AddressDTO();
//		
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//		dto.setTel(tel);
//		dto.setEmail(email);
		
		
		//방법3. 요청 메소드의 매개변수 사용
		
		
		//dao.add(dto);
		System.out.println(dto);
		
		return "ex07ok";
	}

}













