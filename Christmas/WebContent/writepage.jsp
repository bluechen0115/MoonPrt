<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div id="wbrd">
<form action="/write" method="post">
<input type="text" name="title" id="title"/>
<input type="hidden" name="contents" id="contents"/>
<input type="text" value="${loginUser.id}" readonly name="writer"/>
<textarea rows="20" cols="40"></textarea>
</form>



</div>



</body>
</html>