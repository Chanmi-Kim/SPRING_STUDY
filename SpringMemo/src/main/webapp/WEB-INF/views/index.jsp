<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Memo</title>
<link rel="stylesheet" href="/spring/resources/css/bootstrap.css">
<link rel="stylesheet" href="/spring/resources/css/main.css">
<style>
	#tbl { width: 650px; margin: 0px auto; }
	#tbl th:nth-child(1) { width: 50px; }
	#tbl th:nth-child(2) { width: 70px; }
	#tbl th:nth-child(3) { width: 290px; }
	#tbl th:nth-child(4) { width: 170px; }
	#tbl th:nth-child(5) { width: 70px; }
	.btns {
		text-align: center;
		margin-top: 20px;
	}
</style>
</head>
<body>
	
	<!-- index.jsp -->
	<div class="container">
		<h1 class="page-header">Spring Memo</h1>
		<section>
			<ul class="breadcrumb">
				<li>Memo</li>
				<li class="active">List</li>
			</ul>
			
			<table class="table table-bordered" id="tbl">
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>메모</th>
					<th>날짜</th>
					<th>분류</th>
				</tr>
				<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.seq}</td>
					<td>${dto.name}</td>
					<td>
						${dto.memo} 
						<span class="glyphicon glyphicon-edit" onclick="location.href='/spring/edit.memo?seq=${dto.seq}';"></span>
						<span class="glyphicon glyphicon-trash" onclick="location.href='/spring/delok.memo?seq=${dto.seq}';"></span>
					</td>
					<%-- <td><fmt:formatDate value="${dto.regdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td> --%>
					<td>${dto.regdate}</td>
					<td>${dto.category}</td>
				</tr>
				</c:forEach>
			</table>
			
			<div class="btns">
				<input type="button" value="메모 쓰기" class="btn btn-success"
					onclick="location.href='/spring/add.memo';">
			</div>
			
		</section>
	</div>
	
</body>
</html>












