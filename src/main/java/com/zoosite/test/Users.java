package com.zoosite.test;

public class Users {

	private int user_id;
	private String uname;
	private String email;
	private String pass;
	private int activity;
	private String role;
	private String phn_no;

	public Users() {
		this.activity = 1;
	}
	public int getActivity() { 
		return activity;
	}
	public void setActivity(int activity) {
        this.activity = activity;
    }
	public String getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
 
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
