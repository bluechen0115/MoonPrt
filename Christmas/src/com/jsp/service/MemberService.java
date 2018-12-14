package com.jsp.service;

import com.jsp.dto.MemberDto;

public interface MemberService {

	public MemberDto LoginMember(String id);
	public void RegisterMember(MemberDto member);
	public void DeleteMember(String id);
	public void ChangeMember(MemberDto member);

	
}
