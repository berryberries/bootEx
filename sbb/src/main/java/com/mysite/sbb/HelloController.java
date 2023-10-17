package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String main() {
		return "라이브리로드 이거 어떻게 하는거지?";
	}
	
}
