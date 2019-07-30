package com.test.spring;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	// 의존 객체(service)
	@Autowired
	private IBoardService service;

	// 템플릿
	@RequestMapping(value = "/template.action", method = { RequestMethod.GET })
	public String template(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "template";
	}

	@RequestMapping(value = "/list.action", method = { RequestMethod.GET })
	public String list(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		// 1. 서비스 위임 > DB 작업 > select
		// 2. 결과 반환 + 타일즈 호출
		List<BoardDTO> list = service.list();

		req.setAttribute("list", list);

		return "list";
	}

	@RequestMapping(value = "/view.action", method = { RequestMethod.GET })
	public String view(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String seq) {

		// 1. 데이터 가져오기(seq)
		// 2. select where
		// 3. DTO 반환 + JSP 호출

		BoardDTO dto = service.get(seq);

		req.setAttribute("dto", dto);

		return "view";
	}

	@RequestMapping(value = "/add.action", method = { RequestMethod.GET })
	public String add(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String seq) {

		return "add";
	}

	@RequestMapping(value = "/addok.action", method = { RequestMethod.POST })
	public void addok(HttpServletRequest req, HttpServletResponse resp, HttpSession session, BoardDTO dto) {
//1. 데이터 가져오기(4개)
//2. DTO 포장 -> service -> dao -> insert 실행
//3. 결과 반환 + 임시 페이지 작성

		int result = service.add(dto);

		try {
			PrintWriter writer = resp.getWriter();

			writer.write("<script>");

			if (result == 1) {
				writer.write("location.href='/spring/list.action';");
			} else {
				writer.write("alert('failed');history.back();");
			}

			writer.write("</script>");
			writer.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
