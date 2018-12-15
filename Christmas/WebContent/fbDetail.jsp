<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>

<div id="wbrd">
<input type="text" name="title" id="title" readonly value="${detailBoard.title}"/><br/>
<textarea rows="20" cols="40" id="tta" readonly>${detailBoard.contents}</textarea><br/>
<input type="text" value="${detailBoard.writer}" readonly name="writer" id="writer"/><br/>

<button type="button" id="updateText">수정</button>
<button type="button" id="deleteText">삭제</button>
<button type="button" id="showIndex">목록</button>

</div>


</body>

<script>
if("${detailBoard.writer}"!="${loginUser.id}"){
	$('#updateText').css("display","none");
	$('#deleteText').css("display","none");
}
$('#updateText').on('click',function(){
	location.href="<%=request.getContextPath()%>/updateText?bno="+${detailBoard.bno};
});
$('#deleteText').on('click',function(){
	location.href="<%=request.getContextPath()%>/deleteText?bno="+${detailBoard.bno};
});

$('#showIndex').on('click',function(){
	location.href="<%=request.getContextPath()%>/main";
});

</script>




</html>