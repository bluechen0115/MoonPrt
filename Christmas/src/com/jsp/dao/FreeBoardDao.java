package com.jsp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.FreeBoardDto;

public interface FreeBoardDao {

	public void InsertBoard(FreeBoardDto board) throws SQLException;
	public void UpdateBoard(FreeBoardDto board)throws SQLException;
	public void DeleteBoardByBno(int bno) throws SQLException;
	public List<FreeBoardDto> SelectBoardList() throws SQLException;
	public FreeBoardDto SelectBoardByBno(int bno) throws SQLException;
	public void setConn(Connection conn);

	
}
