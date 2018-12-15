<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
<style>
body {
font-family: 'Pacifico', cursive;
}
body{
background-image: url('image/santa.jpg');

background-color: #D9E5FF;
background-size:1960px 1280px;
}
#inputId{
	border:1px solid black;
	width:180px;
	height:35px;
	font-size:20px;
}
#inputPwd{
	border:1px solid black;
	width:180px;
	height:35px;
	font-size:20px;
}
#inputSubmit{
	width:60px;
	height:40px;
	font-size:15px;
	color:#74D36D;
	font-weight:bold;
	background-color:#CD3B3B;
}
#cancel{
	width:60px;
	height:40px;
	font-size:15px;
	color:#74D36D;
	font-weight:bold;
	background-color:#CD3B3B;
}
#loginBox{
	height:170px;
	weight:190px;
	position:absolute;
	left:900px;
	top:100px;
}
#modalDiv{
	position:absolute; 
	background:black;
	opacity:0.7;
	width:100%;
	height:100%;
	display:none;
}
#modalDiv {
opicity:1.0;
}
.tblIn{
	color:white;
}
#modalDiv table{
	margin:0 auto;
	margin-top:300px;
	opacity:;
}
#modalGo{
	color:white;
	font-weight:bold;
	cursor:pointer;
}



</style>
<body>

<div id='loginBox'>

<form action='login' method='post' id='loginForm'>
<input type='text' name='id' id='inputId'/><br/>
<input type='password' name='pwd' id='inputPwd'/><br/>
</form>
<button type='button' id='inputSubmit'>로그인</button>
<button type='button' id='cancel'>취소</button><br/>
<p id="modalGo">회원가입</p>
</div>

<div id="modalDiv">
<form action='login' method='get' id='regForm'>
	<table>
		
		<tr>
			<td class="tblIn">이름</td>
			<td><input type="text" name="regName" id="regName" class="inputAll"></td>
		</tr>
		<tr>
			<td class="tblIn">아이디</td>
			<td><input type="text" name="regId" id="regId"  class="inputAll"/></td>
		</tr>
		<tr>
			<td class="tblIn">패스워드</td>
			<td><input type="password" name="regPwd" id="regPwd" class="inputAll"/></td>
		</tr>
		<tr>
			<td class="tblIn">핸드폰번호</td>
			<td><input type="text" name="regPhone" id="regPhone" class="inputAll"/></td>
		</tr>
		<tr>
			
			<td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button type="button" id="regBtn">확인</button>
				<button type="button" id="cancelBtn">취소</button></td>
		</tr>
		
	</table>
</form>
</div>

</body>

<script>
$('#modalGo').on('click',function(){
	$('#modalDiv').css('display','block');
});
$('#cancelBtn').on('click',function(){
	$('#modalDiv').css('display','none');
	$('.inputAll').val('');
});
$('#regBtn').on('click',function(){
	$('#regForm').submit();
});


$('#inputSubmit').on('mouseover',function(){
	$('#inputSubmit').css('background-color','yellow');
});
$('#inputSubmit').on('mouseout',function(){
	$('#inputSubmit').css('background-color','#CD3B3B');
});
$('#cancel').on('mouseover',function(){
	$('#cancel').css('background-color','yellow');
});
$('#cancel').on('mouseout',function(){
	$('#cancel').css('background-color','#CD3B3B');
});
$('#inputSubmit').on('click',function(){
	$('#loginForm').submit();
});


</script>


</html>