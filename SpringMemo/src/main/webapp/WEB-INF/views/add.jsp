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
<style>
	#tbl {
		width: 500px;
		margin: 0px auto;
	}
	#tbl th {
		width: 100px;
	}
	#tbl td {
		width: 400px;
	}
	textarea[name=memo] {
		height: 150px;
	}
	.btns {
		text-align: center;
		margin-top: 20px;
	}
</style>
</head>
<body>
	
	<!-- add.jsp -->
	<div class="container">
		<h1 class="page-header">Spring Memo</h1>
		<section>
			<ul class="breadcrumb">
				<li>Memo</li>
				<li class="active">Add</li>
			</ul>
			
			<form method="POST" action="/spring/addok.memo">
			<table class="table table-bordered" id="tbl">
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" class="form-control" required></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="memo" class="form-control" required></textarea></td>
				</tr>
				<tr>
					<th>분류</th>
					<td>
						<select name="category" class="form-control">
							<option value="할일">할일</option>
							<option value="약속">약속</option>
							<option value="스터디">스터디</option>
							<option value="살것">살것</option>
						</select>
					</td>
				</tr>
			</table>
			
			<div class="btns">
				<input type="button" value="돌아가기" class="btn btn-default" onclick="">
				<input type="submit" value="메모쓰기" class="btn btn-success">
			</div>
			</form>
			
		</section>
	</div>
	
</body>
</html>












