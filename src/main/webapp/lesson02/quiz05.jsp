<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>길이 변환</h1>
	<form method="post" action="quiz05_01.jsp" >
		<input type="text" name="length"><span>cm</span><br>
		<label for="inch">인치<input type="checkbox" name="unit" id="inch" value="inch"></label> 
		<label for="yard">야드<input type="checkbox" name="unit" id="yard" value="yard"></label> 
		<label for="pit">피트<input type="checkbox" name="unit" id="pit" value="pit"></label>
		<label for="meter">미터<input type="checkbox" name="unit" id="meter" value="meter"></label><br><br>
		<input value="변환하기" type="submit">
	</form>
</body>
</html>