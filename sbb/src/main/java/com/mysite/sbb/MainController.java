package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		//리턴값이 없으면 500오류
		//System.out.println("index");
		
		// responseBody 어노테이션 사용하면 url요청에대한 응답으로 문자열을 리턴
		return "sbb 스프링부트 연습 게시판 ";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
}
