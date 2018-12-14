package com.jsp.dto;

public class MemberDto {
	
	
	
	public MemberDto(String name, String id, String pwd, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
	}
	public MemberDto(){}

	private String name;
	private String id;
	private String pwd;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", id=" + id + ", pwd=" + pwd + ", phone=" + phone + "]";
	}
	
	
	
}
