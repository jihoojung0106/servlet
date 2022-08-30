<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사칙 연산 계산기</h1>
	<form method="post" action="quiz04_01.jsp">
		<input type="text" name="first">
		<select name="operator">
			<option value="mul">*</option>
			<option value="div">/</option>
			<option value="plus">+</option>
			<option value="minus">-</option>
		</select>
		<input type="text" name="second">
		<input type="submit" value="계산하기">
	</form>
</body>
</html>