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
public class MemberUser extends User {
	   private MemberVO member;
	   
	   //�⺻������ �θ��� �����ڸ� ȣ���ؾ߸� ���������� �۵�

	   public MemberUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
	      super(username, password, authorities);
	   }
	   
	   public MemberUser(MemberVO memberVO) {
	            
	      super(memberVO.getUsername(), memberVO.getPassword(),getAuth(memberVO));

	      this.member = memberVO;
	   }
	   
	   //������ ���� �ִ� ���� ���
	   public static Collection<? extends GrantedAuthority> getAuth(MemberVO memberVO) { 

	      List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	      
	      for (AuthVO auth: memberVO.getAuthList()) {
	         authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
	      }
	      
	      return authorities;
	   }   
}