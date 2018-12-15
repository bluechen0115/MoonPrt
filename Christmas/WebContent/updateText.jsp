<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<style>
#tta{
resize: none;
}
#contents{left:10px; top:10px; border:1px solid black;}
#title{top:5px;}
#writer{ top:5px;}
</style>
<body>

<div id="wbrd">
<form action="<%=request.getContextPath() %>/updateText" method="post"><br/>
<input type="text" name="title" id="title" value="${board.title }"/><br/>
<input type="hidden" name="contents" id="contents" value="${board.contents }"/>
<textarea rows="20" cols="40" id="tta">${board.contents}</textarea><br/>
<input type="text" value="${loginUser.id}" readonly name="writer" id="writer"/><br/>
<input type="hidden" value="${board.bno}" name="bno"/>
<input type="submit" value="수정하기"/>
</form>



</div>

<script>
$('#tta').on('keyup',function(){
	var text=$('#tta').val();
	$('#contents').val(text);
});
</script>

</body>
</html>