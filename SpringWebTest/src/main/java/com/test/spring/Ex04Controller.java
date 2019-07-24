package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 구현
//1. Controller 인터페이스 구현(1~3번 예제)
//2. @Controller 어노테이션 사용(4번 예제 ~ )
//	- /SpringWebTest/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml

@Controller
@RequestMapping(value="/ex04.action")
public class Ex04Controller {

	//요청 메소드
	//1. @RequestMapping : 필수
	//2. 반환값 타입 String : 선택
	//		a. String : JSP 페이지 호출
	//		b. void : 컨트롤러 단독(JSP 필요없을 때)
	@RequestMapping
	public String test() {
		
		return "ex04";
	}
	
	public String aaa() {
		return "";
	}
	
}


















