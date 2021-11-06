package org.artfor.app.web;

public class UserDTO {
	private int user_idx;
	private String user_id;
	private String user_name;
	private String user_email;
	private String user_pw;
	private String user_address;
	private String user_phone;
	private String user_role;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int user_idx, String user_id, String user_name, String user_email, String user_pw,
			 String user_address, String user_phone, String user_role) {
		super();
		this.user_idx = user_idx;
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_pw = user_pw;
		this.user_address = user_address;
		this.user_phone = user_phone;
		this.user_role = user_role;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}


	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "UserDTO [user_idx=" + user_idx + ", user_id=" + user_id + ", user_name=" + user_name + ", user_email="
				+ user_email + ", user_pw=" + user_pw + ", user_address="
				+ user_address + ", user_phone=" + user_phone + ", user_role=" + user_role + "]";
	}


}
