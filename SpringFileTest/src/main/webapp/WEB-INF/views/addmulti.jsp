<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function() {
		document.getElementById("btnAdd").onclick = function() {
			addFile();
		};
		
		addFile();
	};//onload
	
	var n = 1;
	
	function addFile() {
		var files = document.getElementById("files");
		var file = "<div><input type='file' name='attach" + n + "'></div>";
		files.innerHTML += file;
		n++;
	}
</script>
</head>
<body>
	<h1>다중 업로드</h1>
	
	<form method="POST" action="/spring/addmultiok.action" enctype="multipart/form-data">
		
		<p>일반 데이터 : <input type="text" name="data"></p>
		<p>
			파일 데이터 :
			<input type="button" value="+첨부파일" id="btnAdd">
			<div id="files"></div>
		</p>
		<p><input type="submit" value="업로드"></p>
		
	</form>
	
</body>
</html>













