package com.test.spring;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//목록보기 - 모두
//글보기 - 회원전용
@Aspect
@Component
public class Auth {

	@Pointcut("execution(public String AOPController.view(..))")
	public void pc1() {}
	
	@Before("pc1()")
	public void check(JoinPoint joinPoint) {
		
		//현재 주업무를 발생시킨 사람이 로그인 했는지?
		HttpSession session = (HttpSession)joinPoint.getArgs()[1];
		HttpServletResponse resp = (HttpServletResponse)joinPoint.getArgs()[3];
		
		if (session.getAttribute("id") == null) {
			
			//쫒아내기 > 경고 + 이동
			try {
				
				resp.setCharacterEncoding("UTF-8");
				PrintWriter writer = resp.getWriter();

				writer.print("<html>");
				writer.print("<head>");
				writer.print("<meta charset='UTF-8'>");
				writer.print("<script>");
				writer.print("alert('회원 전용입니다.');");
				writer.print("location.href='/spring/list.action';");
				writer.print("</script>");
				writer.print("</head>");
				writer.print("<body>");
				writer.print("</body>");
				writer.print("</html>");
				
				writer.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
	}
	
}











