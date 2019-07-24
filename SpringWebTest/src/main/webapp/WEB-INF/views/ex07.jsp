<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주소록 추가하기</h1>
	
	<form method="POST" action="/spring/address/addok.action">
	<table border="1" width="400">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>나이</th>
			<td><input type="text" name="age"></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<th>전화</th>
			<td><input type="text" name="tel"></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name="email"></td>
		</tr>
	</table>
	<br>
	<input type="submit" value="등록하기">
	</form>
</body>
</html>















