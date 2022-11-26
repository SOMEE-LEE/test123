package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	//컨트롤러와 서비스 연결(MailService는 클래스, mailService는 인스턴스)
	@Autowired
	private MailService mailService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		mailService.sendMail();
		return "이메일 서비스 시작 전 테스트";
	}
	
	
}
