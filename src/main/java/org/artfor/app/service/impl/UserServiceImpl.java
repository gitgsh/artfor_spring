package org.artfor.app.service.impl;

import java.util.List;

import org.artfor.app.service.UserService;
import org.artfor.app.service.mapper.UserMapper;
import org.artfor.app.web.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper mapper;

	@Override
	public List<UserDTO> getUserList() {
		return mapper.getUserList();
	}

	//아직 미완성
	@Override
	public void join(UserDTO dto) {
		System.out.println("serviceImpl >> join");
	}
	
	//로그인을 위한 기능

	@Override
	public int login(UserDTO dto) {
		System.out.println("serviceImpl >> login ");
		
		return mapper.login();
	}

	@Override
	public int checkUser(UserDTO dto) {
		String id = dto.getUser_id();
		String pw = dto.getUser_pw();
		
		UserDTO userdto = mapper.findUser(id);
		if(userdto == null) {
			//아이디 없음
			return 0;
		}else {
			if(pw.equals(userdto.getUser_pw())) {
				// 아이디, 비밀번호 일치 -> 로그인 시켜줘
				return 1;
			}else {
				//아이디 일치, 비번 틀림
				return -1;
			}
		}

	}



	


	
}
