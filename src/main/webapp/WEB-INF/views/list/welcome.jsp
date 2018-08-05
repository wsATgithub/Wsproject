<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/css/common.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript" src="/resources/js/jquery-1.11.3.min.js"></script>

<title>welcome</title>

<script>
$(function(){
	$("#btn").click(function(){
		alert("aa");
	});
});
</script>
</head>
<body>
	<div>
		<a href="/">TOP</a>
	</div>
	<div class="center">
		<img alt="welcome" src="/resources/images/disp/welcome.jpg"><br>
		welcome:<c:out value="${ loginName}"/><br>
		<input type="button" value="click me" id="btn">
	</div>
</body>
</html>