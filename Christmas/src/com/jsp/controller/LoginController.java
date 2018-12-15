
package com.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.FreeBoardDto;
import com.jsp.dto.MemberDto;
import com.jsp.service.FreeBoardService;
import com.jsp.service.FreeBoardServiceImpl;
import com.jsp.service.MemberSerivceImpl;
import com.jsp.service.MemberService;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	MemberService service=new MemberSerivceImpl();
	MemberDto member=new MemberDto(request.getParameter("regName"),request.getParameter("regId"),request.getParameter("regPwd"),request.getParameter("regPhone"));
	service.RegisterMember(member);
	response.sendRedirect("index.jsp");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String loginId=request.getParameter("id");
	String loginPwd=request.getParameter("pwd");
	
	MemberService service=new MemberSerivceImpl();
	MemberDto member=service.LoginMember(loginId);
	String msg;
	HttpSession session=request.getSession();
	
	if((member.getId())==null) {
		msg="<script>alert('?ïÑ?ù¥?îîÍ∞? ?óÜ?äµ?ãà?ã§.')</script>";
		
	}else {
		if((member.getPwd()).equals(loginPwd)) {
			msg="<script>alert('Î°úÍ∑∏?ù∏?óê ?Ñ±Í≥µÌïò???äµ?ãà?ã§.')</script>";
			session.setAttribute("loginUser", member);
			
		}else {
			msg="<script>alert('?å®?ä§?õå?ìúÍ∞? ÎßûÏ? ?ïä?äµ?ãà?ã§.')</script>";
		}
		
	}
	session.setAttribute("msg", msg);
	
	response.sendRedirect("main");
	
	return;
	
	}

}
