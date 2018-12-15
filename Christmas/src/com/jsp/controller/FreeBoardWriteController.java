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


@WebServlet("/write")
public class FreeBoardWriteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("/writepage.jsp").forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FreeBoardService freeBoardService=new FreeBoardServiceImpl();
		FreeBoardDto board=new FreeBoardDto();
		{
			board.setTitle(request.getParameter("title"));
			board.setContents(request.getParameter("contents"));
			board.setWriter(request.getParameter("writer"));
		}
		freeBoardService.WriteBoard(board);
		
	response.sendRedirect("main");
		
	}

}
