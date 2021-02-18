package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */

@Log4j
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome HOME");
		return "home";
	}
	
	// login ���� �Ʒ� loginForm.jsp�� �־���� ��.
	@GetMapping("/login/loginForm")
	public String loginForm() {
		log.info("Welcome loginForm");
		return "login/loginForm2";
	}
	
	// ���� Ȩ ��ũ
	@GetMapping("/user/userHome")
	public void userHome() {
		log.info("userHome");
	}
	
	// ������ Ȩ ��ũ
	@GetMapping("/admin/adminHome")
	public void adminHome() {
		log.info("adminHome");
	}
	
	@GetMapping("/login/accessDenied")
	public void accessDenied() {
		log.info("accessDenied");
	}
	
}
