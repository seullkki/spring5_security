package edu.bit.ex;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.service.UserService;
import edu.bit.ex.vo.MemberVO;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class UserController {
	
	private UserService userService;
	
	// 회원 가입 링크를 회원가입 페이지로 연결하기 위한 컨트롤러 만들기
	@GetMapping("/user/userForm")
	public void userForm() {
		log.info("Welcome userForm");
	}
	
	// 회원가입 페이지에서 받은 데이터를 DB에 INSERT 할 컨트롤러
	@PostMapping("/user/addUser")
	public String addUser(UserVO userVO) {
		log.info("Welcome addUser");
		
		userService.addUser(userVO);
		
		return "redirect:/";
	}
	
	// session 관련
	   @GetMapping("/loginInfo")
	   public String loginInfo(Principal principal) {
	      
	      // 1.Controller를 통하여 Pincipal객체로 가져오는 방법
	      String user_id = principal.getName();
	      System.out.println("유저 아이디:" + user_id);

	      // 2.SpringContextHolder를 통하여 가져오는 방법(일반적인 빈에서 사용 할수있음 )
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      user_id = auth.getName();
	      System.out.println("유저 아이디:" + user_id);

	      // 3.
	      UserDetails userDetails = (UserDetails) auth.getPrincipal();
	      System.out.println(userDetails.getUsername());

	      //4.핵심
	      MemberVO memberVO = (MemberVO) auth.getPrincipal();
	      System.out.println(memberVO.getPassword());

	      
	      // 4.User 클래스로 변환 하여 가져오는 방법
	      User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      user_id = user.getUsername();
	      System.out.println("유저 아이디:" + user_id);

	      return "home";

	   }
	
}
