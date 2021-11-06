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
		//1. ���� id�� qw�� üũ
		int result = service.checkUser(dto);
		if(result == 1) {
			System.out.println("���̵�, ��й�ȣ ��ġ");
			return 1;
		}else if(result == -1) {
			System.out.println("���̵� ��ġ, ��й�ȣ ����ġ");
			return -1;
		}else{
			System.out.println("���̵� ����");
			return 0;
		}
		//2. check���� true�� �α��ν�Ų��.
		

	}
	

}
	
