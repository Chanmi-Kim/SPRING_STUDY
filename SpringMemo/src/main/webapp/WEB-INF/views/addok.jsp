<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Memo</title>
<link rel="stylesheet" href="/spring/resources/css/bootstrap.css">
<link rel="stylesheet" href="/spring/resources/css/main.css">
</head>
<body>
	
	<!-- addok.jsp -->
	<div class="container">
		<h1 class="page-header">Spring Memo</h1>
		<section>
			<ul class="breadcrumb">
				<li>Memo</li>
				<li class="active">List</li>
			</ul>
			
			<script>
				
				<c:if test="${result == 1}">
				location.href = "/spring/index.memo";
				</c:if>
				
				<c:if test="${result != 1}">
				alert("메모 쓰기 실패;;");
				history.back();
				</c:if>
				
			</script>
			
		</section>
	</div>
	
</body>
</html>












