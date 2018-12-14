package com.jsp.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.jsp.dto.MemberDto;

public interface MemberDao {
	
	public MemberDto SelectMemberById(String id) throws SQLException;
	public void InsertMember(MemberDto member) throws SQLException;
	public void DeleteMemberById(String id) throws SQLException;
	public void UpdateMemberById(MemberDto member) throws SQLException;
	public void setConn(Connection conn);

}
