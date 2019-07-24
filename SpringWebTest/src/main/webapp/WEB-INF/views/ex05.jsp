<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>글쓰기</h1>
	
	<form method="POST" action="/spring/addok.action">
		<div>제목 : <input type="text" name="subject"></div>
		<div>작성자 : <input type="text" name="name"></div>
		<div><input type="submit" value="보내기"></div>
	</form>
	
</body>
</html>












