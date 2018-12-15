<%@page import="com.jsp.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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




<table border="1">
<tr>
<th>글번호</th>
<th>제목</th>
<th>작성자</th>
</tr>

<c:forEach items="${showList}" var="board">
<tr>
<td>${board.bno }</td>
<td>${board.title }</td>
<td>${board.writer }</td>
</tr>
</c:forEach>

</table>













</body>
</html>