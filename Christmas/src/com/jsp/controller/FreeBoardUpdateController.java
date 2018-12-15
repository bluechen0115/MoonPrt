package com.jsp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.FreeBoardDto;
import com.jsp.service.FreeBoardService;
import com.jsp.service.FreeBoardServiceImpl;

/**
 * Servlet implementation class FreeBoardUpdateController
 */
@WebServlet("/updateText")
public class FreeBoardUpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno=Integer.parseInt(request.getParameter("bno"));
		FreeBoardService freeBoardService=new FreeBoardServiceImpl();
		FreeBoardDto board=freeBoardService.ShowBoardParts(bno);
		request.setAttribute("board", board);
		request.getRequestDispatcher("/updateText.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String writer=request.getParameter("writer");
	String title=request.getParameter("title");
	String contents=request.getParameter("contents");
	int bno=Integer.parseInt(request.getParameter("bno"));
	FreeBoardDto board=new FreeBoardDto(bno,writer,contents,null,title);
	FreeBoardService freeBoardService=new FreeBoardServiceImpl();
	freeBoardService.ChangeBoard(board);
	response.sendRedirect("fbDetail?bno="+bno);
	
	}

}
