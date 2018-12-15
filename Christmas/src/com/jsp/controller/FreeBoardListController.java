package com.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.FreeBoardDao;
import com.jsp.dto.FreeBoardDto;
import com.jsp.service.FreeBoardService;
import com.jsp.service.FreeBoardServiceImpl;

/**
 * Servlet implementation class FreeBoardListController
 */
@WebServlet("/main")
public class FreeBoardListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	FreeBoardService freeBoardService=FreeBoardServiceImpl.getInstance();
	List<FreeBoardDto> freeBoardList=(ArrayList<FreeBoardDto>)freeBoardService.ShowBoardAll();
	request.setAttribute("showList", freeBoardList);
	request.getRequestDispatcher("/main.jsp").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
