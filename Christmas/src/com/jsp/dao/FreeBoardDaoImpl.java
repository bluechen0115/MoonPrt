package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.FreeBoardDto;

public class FreeBoardDaoImpl implements FreeBoardDao {
	
	
	private static FreeBoardDaoImpl instance=new FreeBoardDaoImpl();
	private FreeBoardDaoImpl() {}
	public static FreeBoardDaoImpl getInstance() {
		return instance;
	}
	
	Connection conn;

	@Override
	public void InsertBoard(FreeBoardDto board) throws SQLException{
		PreparedStatement pstmt=null;
		String sql="insert into freeboard (bno,writer,title,contents) values(freeboad_seq.nextval,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, board.getWriter());
		pstmt.setString(2, board.getTitle());
		pstmt.setString(3, board.getContents());
		pstmt.executeUpdate();
		pstmt.close();
		
	}

	@Override
	public void UpdateBoard(FreeBoardDto board) throws SQLException{
		PreparedStatement pstmt=null;
		String sql="update freeboard set title=?,contents=? where bno=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContents());
		pstmt.setInt(3, board.getBno());
		pstmt.executeUpdate();
		pstmt.close();
		
	}

	@Override
	public void DeleteBoardByBno(int bno) throws SQLException{
		Statement stmt=null;
		String sql="delete from freeboard where bno="+bno;
		stmt=conn.createStatement();
		stmt.executeQuery(sql);
		stmt.close();
		
	}

	@Override
	public List<FreeBoardDto> SelectBoardList() throws SQLException{
		List<FreeBoardDto> FreeBoardList=new ArrayList<FreeBoardDto>();
		ResultSet rs=null;
		Statement stmt=null;
		String sql="select * from freeboard order by bno desc";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			FreeBoardDto board=new FreeBoardDto();
			board.setBno(rs.getInt("bno"));
			board.setTitle(rs.getString("title"));
			board.setContents(rs.getString("contents"));
			board.setWriter(rs.getString("writer"));
			FreeBoardList.add(board);
		}
		rs.close();
		stmt.close();
		return FreeBoardList;
	}

	@Override
	public FreeBoardDto SelectBoardByBno(int bno) throws SQLException{
		Statement stmt=null;
		ResultSet rs=null;
		FreeBoardDto board=new FreeBoardDto();
		String sql="select * from freeboard where bno="+bno;
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()) {
		board.setBno(bno);
		board.setTitle(rs.getString("title"));
		board.setContents(rs.getString("contents"));
		board.setWriter(rs.getString("writer"));
		board.setWriteDate(rs.getDate("writedate"));
		}
		rs.close();
		stmt.close();
		return board;
	}

	@Override
	public void setConn(Connection conn) {
		this.conn=conn;
		
	}

}
