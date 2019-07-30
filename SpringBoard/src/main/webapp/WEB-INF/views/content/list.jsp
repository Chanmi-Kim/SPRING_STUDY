<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#tbl th:nth-child(1) {
	width: 60px;
}

#tbl th:nth-child(2) {
	width: 490px;
}

#tbl th:nth-child(3) {
	width: 90px;
}

#tbl th:nth-child(4) {
	width: 160px;
}

#tbl th, #tbl td {
	text-align: center;
}

#tbl td:nth-child(2) {
	text-align: left;
}
</style>
<div id="section">
	<table id="tbl" class="table table-bordered">
		<%-- <c:forEach items="${list}" var="dto"> --%>
			<%-- ${dto.name}<br> - 콘솔에서 확인 --%>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>날짜</th>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.seq}</td>
					<td><a href="/spring/view.action?seq=${dto.seq}">${dto.subject}</a></td>
					<td>${dto.name}</td>
					<td>${dto.regdate}</td>
				</tr>
			</c:forEach>
		<%-- </c:forEach> --%>
	</table>
	
	<div id="btns">
		<input type="button" value="글쓰기" class="btn btn-success" onclick="location.href='/spring/add.action';">
	</div>
</div>