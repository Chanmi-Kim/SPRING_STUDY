<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과</h1>
	<c:if test="${result > 0}">
		성공했습니다.
	</c:if>
	<c:if test="${result == 0}">
		실패했습니다.
	</c:if>
	
	<hr>
	
	<p>총 직원수 : ${count}명</p>
	
	<hr>
	
	<p>${dto.name} - ${dto.buseo} - ${dto.jikwi} - ${dto.city}</p>
	
	<hr>
	
	<c:forEach items="${blist}" var="buseo">
		<div>${buseo}</div>
	</c:forEach>
	
	<hr>
	
	<c:forEach items="${list}" var="dto">
		<div>${dto.name} - ${dto.jikwi}</div>
	</c:forEach>
	
</body>
</html>













