<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/css/common.css" type="text/css" rel="stylesheet"/>
<title>fileup</title>
</head>
<body>
	<div>
		<a href="/">TOP</a>
	</div>
	<form:form action="/upload/fileup" method="post" enctype="multipart/form-data">
		<div style="font-size:0.5em;">
			<input type="file" name="fileup"/><br>
			<input type="submit" id="upload" value="upload"/>
		</div>
	</form:form>
</body>
</html>