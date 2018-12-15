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
 * Servlet implementation class FreeBoardDetailController
 */
@WebServlet("/fbDetail")
public class FreeBoardDetailController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno=Integer.parseInt(request.getParameter("bno"));
		FreeBoardService freeBoardService=new FreeBoardServiceImpl();
		FreeBoardDto board=new FreeBoardDto();
		board=freeBoardService.ShowBoardParts(bno);
		request.setAttribute("detailBoard", board);
		request.getRequestDispatcher("/fbDetail.jsp").forward(request, response);
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
