package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.dto.MemberDto;

public class MemberDaoImpl implements MemberDao{

	
	
	Connection conn;
	public void setConn(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public MemberDto SelectMemberById(String id) throws SQLException{
		Statement stmt=null;
		ResultSet rs=null;
		MemberDto member=new MemberDto();
		String sql="select * from member where id="+"'"+id+"'";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()) {
			member.setName(rs.getString("name"));
			member.setId(rs.getString("id"));
			member.setPwd(rs.getString("pwd"));
			member.setPhone(rs.getString("phone"));
		}
			rs.close();
			stmt.close();
		
		
		
		
		return member;
	}

	@Override
	public void InsertMember(MemberDto member) throws SQLException{
		PreparedStatement pstmt=null;
		String sql="insert into member (name,id,pwd,phone) values (?,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, member.getName());
		pstmt.setString(2, member.getId());
		pstmt.setString(3, member.getPwd());
		pstmt.setString(4, member.getPhone());
		pstmt.executeUpdate();
		pstmt.close();
		return;
		
	}

	@Override
	public void DeleteMemberById(String id) throws SQLException{
		Statement stmt=null;
		String sql="delete from member where id="+"'"+id+"'";
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		
	}

	@Override
	public void UpdateMemberById(MemberDto member) throws SQLException {
		PreparedStatement pstmt=null;
		String sql="update member set name=?,pwd=?,phone=? where id=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, member.getName());
		pstmt.setString(2, member.getPwd());
		pstmt.setString(3, member.getPhone());
		pstmt.setString(4, member.getId());
		pstmt.executeUpdate();
		
		return;
		
	}
	
	

}
