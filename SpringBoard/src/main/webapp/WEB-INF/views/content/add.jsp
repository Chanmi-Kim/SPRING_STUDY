<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	#tbl th { width: 150px; }
	#tbl td { width: 650px; }
	#tbl tr:nth-child(4) textarea { height: 400px; }
</style>
<div id="section">

	<form method="POST" action="/spring/addok.action">
		<table id="tbl" class="table table-bordered">
			<tr>	
				<th>이름</th>
				<td><input type="text" name="name" class="form-control" required></td>
			</tr>
			<tr>	
				<th>암호</th>
				<td><input type="password" name="pw" class="form-control" required></td>
			</tr>
			<tr>	
				<th>제목</th>
				<td><input type="text" name="subject" class="form-control" required></td>
			</tr>
			<tr>	
				<th>내용</th>
				<td><textarea name="content" class="form-control" required></textarea></td>
			</tr>
		</table>
		
		<div id="btns">
			<input type="button" value="목록으로" class="btn btn-success" onclick="location.href='/spring/list.action';">
		</div>
		
		<div id="btns">
			<input type="submit" value="글쓰기" class="btn btn-success">
		</div>
	</form>
</div>