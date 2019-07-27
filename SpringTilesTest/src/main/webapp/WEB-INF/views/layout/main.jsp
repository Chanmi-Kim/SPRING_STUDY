<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사이트</title>
<tiles:insertAttribute name="asset"></tiles:insertAttribute>
<style>

</style>
</head>
<body>
	<div id="main">
		<tiles:insertAttribute name="mainmenu"></tiles:insertAttribute>
		<tiles:insertAttribute name="submenu"></tiles:insertAttribute>
		<tiles:insertAttribute name="content"></tiles:insertAttribute>		
	</div>	
</body>
</html>


















