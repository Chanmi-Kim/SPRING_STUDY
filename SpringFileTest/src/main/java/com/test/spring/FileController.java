package com.test.spring;

import java.io.File;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {

	//단일 업로드
	@RequestMapping(value = "/add.action", method = { RequestMethod.GET })
	public String add(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "add";
	}
	
	@RequestMapping(value = "/addok.action", method = { RequestMethod.POST })
	public String addok(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String data) {
		
		//첨부 파일(cos.jar > MultipartRequest와 같은 역할)
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest)req;
		
		//<input type="file" name="attach">
		MultipartFile attach = multi.getFile("attach"); //첨부 파일 참조 객체
		
		System.out.println(attach.getName());
		System.out.println(attach.getOriginalFilename());//사용자 올린 이름 + 하드 저장되는 이름
		System.out.println(attach.getSize());
		System.out.println(attach.getContentType());
		
		//cos.jar
		// 1. MultipartRequest 객체 생성 == 파일 업로드 완료
		//spring
		// 1. MultipartHttpServletRequest 객체 생성 <> 파일 업로드 완료 > 직접 수동으로 파일 업로드 처리 구현 : 첨부된 파일을 우리가 원하는 장소로 이동 구현 + 파일명 변경 구현
		
		//첨부 파일명이 중복 된다면..
		//1. 아무것도 안하면
		// - 덮어쓰기 발생
		// - 절대 비권장
		
		//2. 유일한 파일명 생성
		// - 틱값 + 파일명
		// - 현재시각 + 파일명
		
		//3. 인덱싱 구현
		// - 숫자 붙이기
		
		String filename = attach.getOriginalFilename();
		filename = getFileName(req.getRealPath("resources/files"), filename);
		
		System.out.println(req.getRealPath("resources/files"));
		File file = new File(req.getRealPath("resources/files") + "\\" + filename);
		
		try {
			
			attach.transferTo(file);
			
		} catch (Exception e) {
			System.out.println("FileController.addok : " + e.toString());
		}
		
		

		return "addok";
	}
	
	
	//중복된 파일명 넘버링하기
	private String getFileName(String path, String filename) {
		
		//path = "/resources/files/"
		//filename = "dog.png"
		
		int n = 1;
		int index = filename.lastIndexOf(".");
		String tempName = filename.substring(0, index); //"dog"
		String tempExt = filename.substring(index); //".png"
		
		//중복 검사
		while (true) {
			File file = new File(path + "\\" + filename); // files/dog.png
			
			if (file.exists()) {
				filename = tempName + "_" + n + tempExt; // "dog_1.png"
				n++;
			} else {
				return file.getName();//중복 안된다고 판단된 유일한 이름
			}
			
		}	
		
	}
	
	
	
	
	//다중 업로드
	@RequestMapping(value = "/addmulti.action", method = { RequestMethod.GET })
	public String addmulti(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "addmulti";
	}
	
	@RequestMapping(value = "/addmultiok.action", method = { RequestMethod.POST })
	public String addmultiok(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String data) {
		
		//multi
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest)req;
		
		//첨부 파일 참조
		//multi.getFile("attach");
		
		//모든 <input type="file">의 이름을 반환
		Iterator<String> iter = multi.getFileNames();
		
		while (iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
			
			MultipartFile attach = multi.getFile(item); //첨부 파일 참조 객체
			
			String filename = attach.getOriginalFilename();
			filename = getFileName(req.getRealPath("/resources/files"), filename);
			
			File file = new File(req.getRealPath("/resources/files") + "\\" + filename);
			
			try {
				attach.transferTo(file);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
		

		return "addmultiok";
	}
	
}




















