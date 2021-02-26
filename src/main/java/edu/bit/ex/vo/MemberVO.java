package edu.bit.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MemberVO {
	private String username;
	private String password;
	private String enabled;
	
	private List<AuthVO> authList;
}
