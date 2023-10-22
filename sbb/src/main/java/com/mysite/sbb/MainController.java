package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		//���ϰ��� ������ 500����
		//System.out.println("index");
		
		// responseBody ������̼� ����ϸ� url��û������ �������� ���ڿ��� ����
		return "sbb ��������Ʈ ���� �Խ��� ";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
}
