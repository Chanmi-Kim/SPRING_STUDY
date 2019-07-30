<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	#tbl th { width: 150px; }
	#tbl td { width: 650px; }
	#tbl tr:nth-child(4) td { height: 400px; }
</style>
<div id="section">
	<table id="tbl" class="table table-bordered">
		<tr>	
			<th>번호</th>
			<td>${dto.seq}</td>
		</tr>
		<tr>	
			<th>이름</th>
			<td>${dto.name}</td>
		</tr>
		<tr>	
			<th>제목</th>
			<td>${dto.subject}</td>
		</tr>
		<tr>	
			<th>내용</th>
			<td>${dto.content}</td>
		</tr>
		<tr>	
			<th>날짜</th>
			<td>${dto.regdate}</td>
		</tr>
	</table>
	
	<div id="btns">
		<input type="button" value="목록으로" class="btn btn-success" onclick="location.href='/spring/list.action';">
	</div>
	
	<div id="btns">
		<input type="button" value="글수정하기" class="btn btn-success" onclick="location.href='/spring/edit.action';">
	</div>
	
	<div id="btns">
		<input type="button" value="글삭제하기" class="btn btn-success" onclick="location.href='/spring/del.action';">
	</div>
	
</div>

