package com.jsp.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.jsp.dao.MemberDao;
import com.jsp.dao.MemberDaoImpl;
import com.jsp.datasource.DataSource;
import com.jsp.dto.MemberDto;

public class MemberSerivceImpl implements MemberService{

	DataSource dataSource=DataSource.getInstatnce();
	Connection conn=dataSource.getConnection();
	MemberDao memberDao=new MemberDaoImpl();
	
	
	
	

	@Override
	public MemberDto LoginMember(String id) {
		
		memberDao.setConn(conn);
		MemberDto member=new MemberDto();
		try {
			member=memberDao.SelectMemberById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return member;
	}

	@Override
	public void RegisterMember(MemberDto member) {
		memberDao.setConn(conn);
		try {
			memberDao.InsertMember(member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}

	@Override
	public void DeleteMember(String id) {
		memberDao.setConn(conn);
		try {
			memberDao.DeleteMemberById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
		
	}

	@Override
	public void ChangeMember(MemberDto member) {
		memberDao.setConn(conn);
		try {
			memberDao.UpdateMemberById(member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}
	

}
