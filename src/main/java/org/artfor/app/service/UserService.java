package org.artfor.app.service;

import java.util.List;

import org.artfor.app.web.UserDTO;

public interface UserService {

	public List<UserDTO> getUserList();

	public void join(UserDTO dto);

	public int login(UserDTO dto);

	public int checkUser(UserDTO dto);



}
