package edu.bit.ex.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Setter
@Getter
@ToString
public class EmpUser extends User {
	   private EmpVO empVO;
	   
	   //기본적으로 부모의 생성자를 호출해야만 정상적으로 작동

	   public EmpUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
	      super(username, password, authorities);
	   }
	   
	   public EmpUser(EmpVO empVO) {
	            
	      super(empVO.getEName(), empVO.getEmpNo(), getAuth(empVO));

	      this.empVO = empVO;
	   }
	   
	   //유저가 갖고 있는 권한 목록
	   public static Collection<? extends GrantedAuthority> getAuth(EmpVO empVO) { 

	      List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	      
	      for (AuthVO auth: empVO.getAuthList()) {
	         authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
	      }
	      
	      return authorities;
	   }   
}
