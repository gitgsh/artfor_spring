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

	//���� �̿ϼ�
	@Override
	public void join(UserDTO dto) {
		System.out.println("serviceImpl >> join");
	}
	
	//�α����� ���� ���

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
			//���̵� ����
			return 0;
		}else {
			if(pw.equals(userdto.getUser_pw())) {
				// ���̵�, ��й�ȣ ��ġ -> �α��� ������
				return 1;
			}else {
				//���̵� ��ġ, ��� Ʋ��
				return -1;
			}
		}

	}



	


	
}
