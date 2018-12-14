<%@page import="com.jsp.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	
body{
background-image: url('image/ChristmasBackground.jpg');

background-color: #D9E5FF;
background-size:1700px 1100px;
}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<body>
<%=(String)session.getAttribute("msg")%>
<%
session.removeAttribute("msg");
MemberDto member=(MemberDto)session.getAttribute("loginUser");
if(session.getAttribute("loginUser")==null){
%>
<script>
location.href="<%=request.getContextPath()%>/index.jsp"
</script>
<%
}
%>
















</body>
</html>