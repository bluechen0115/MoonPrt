package com.jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dao.FreeBoardDao;
import com.jsp.dao.FreeBoardDaoImpl;
import com.jsp.datasource.DataSource;
import com.jsp.dto.FreeBoardDto;

public class FreeBoardServiceImpl implements FreeBoardService {
	
	DataSource datasource=DataSource.getInstatnce();
	Connection conn=datasource.getConnection();
	FreeBoardDao freeBoardDao=FreeBoardDaoImpl.getInstance();
	{
		freeBoardDao.setConn(conn);
	}
	
/*	private static FreeBoardService instance=new FreeBoardServiceImpl();
	private FreeBoardServiceImpl() {}
	public static FreeBoardService getInstance() {
		return instance;
	}*/

	@Override
	public void WriteBoard(FreeBoardDto board) {
		try {
			freeBoardDao.InsertBoard(board);
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
		
	}

	@Override
	public void ChangeBoard(FreeBoardDto board) {
		try {
			freeBoardDao.UpdateBoard(board);
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
		
	}

	@Override
	public void TerminateBoard(int bno) {
		try {
			freeBoardDao.DeleteBoardByBno(bno);
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
	}

	@Override
	public List<FreeBoardDto> ShowBoardAll() {
		List<FreeBoardDto> freeBoardList = null;
		try {
			freeBoardList=freeBoardDao.SelectBoardList();
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
		return freeBoardList;
	}

	@Override
	public FreeBoardDto ShowBoardParts(int bno) {
		FreeBoardDto freeBoard=null;
		try {
			freeBoard=freeBoardDao.SelectBoardByBno(bno);
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
		return freeBoard;
	}

}
