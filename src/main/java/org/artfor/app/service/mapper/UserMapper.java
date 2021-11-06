package org.artfor.app.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.artfor.app.web.UserDTO;

@Mapper
public interface UserMapper {

	public List<UserDTO> getUserList();

	//로그인을 위한 기능 
	public int login();

	public UserDTO findUser(String id);





}
