<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>단일 업로드</h1>
	
	<form method="POST" action="/spring/addok.action" enctype="multipart/form-data">
		
		<p>일반 데이터 : <input type="text" name="data"></p>
		<p>파일 데이터 : <input type="file" name="attach"></p>
		<p><input type="submit" value="업로드"></p>
		
	</form>
	
</body>
</html>













