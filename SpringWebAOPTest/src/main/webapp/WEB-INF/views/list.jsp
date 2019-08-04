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
	<h1>게시판</h1>
	
	<p>
		<c:if test="${not empty id}">로그인(${id})</c:if>
		<c:if test="${empty id}">익명</c:if>
	</p>
	
	<c:forEach items="${list}" var="dto">
		<div><a href="/spring/view.action?seq=${dto.seq}">${dto.subject}</a> - ${dto.name}</div>
	</c:forEach>
	
</body>
</html>











