package edu.bit.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@AllArgsConstructor
public class UserVO {
   private String username;
   private String password;
   private int enabled;
   
   // 디폴트로, 아무것도 입력되지 않았으면 아래 값을 넣어주라는 의미.
   public UserVO(){
      this("user", "1111", 1);
   }
   
}
