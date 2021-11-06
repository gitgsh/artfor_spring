package org.artfor.app;

import java.util.List;

import org.artfor.app.service.UserService;
import org.artfor.app.web.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value="/user")

public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(value="/userList.do", method = RequestMethod.GET)
	public List<UserDTO> getUserList() {
		System.out.println(">>> userList.do");

		List<UserDTO> userList = service.getUserList();
		
		System.out.println("list>>> "+ userList);
		
		return userList;
		}
	

	
	@RequestMapping(value="/join.do", method = RequestMethod.POST)
	public void joinProcess(@RequestBody UserDTO dto) {
		service.join(dto);
		System.out.println(">>> join.do"+ dto);
	}
	
	@RequestMapping(value="login.do", method = RequestMethod.POST)
	public int loginProcess(@RequestBody UserDTO dto) {
		
		System.out.println("login.do >>> "+ dto);
		//1. 유저 id와 qw를 체크
		int result = service.checkUser(dto);
		if(result == 1) {
			System.out.println("아이디, 비밀번호 일치");
			return 1;
		}else if(result == -1) {
			System.out.println("아이디 일치, 비밀번호 불일치");
			return -1;
		}else{
			System.out.println("아이디 없음");
			return 0;
		}
		//2. check값이 true면 로그인시킨다.
		

	}
	

}
	
