<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="ex03_01.jsp">
		1.별명은 무엇입니까?<input type="text" name="nickname"><br><br>
		2.취미는 무엇입니까?<input type="text" name="hobby"><br><br>
		3.강아지 or 고양이? 
		<label for="dog">강아지</label>
		<input type="radio" id="dog" name="animal" value="dog" checked>
		<label for="cat">고양이</label>
		<input type="radio" id="cat" name="animal" value="cat">
		<br><br>
		4.다음 중 선호하는 것을 모두 고르세요.<br>
		<label for="mintchoco">민트초코</label>
		<input type="checkbox" id="mintchoco" name="food" value="mintchoco" checked>
		
		<label for="pizza">하와이안피자</label>
		<input type="checkbox" id="pizza" name="food" value="pizza" checked>
		
		<label for="pupa">번데기</label>
		<input type="checkbox" id="pupa" name="food" value="pupa" checked>
		<button type="submit">제출</button>
	</form>
</body>
</html>