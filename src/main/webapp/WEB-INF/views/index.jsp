<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/ws.js"></script>
</head>
<body>
	<div>
		<form:form modelAttribute="indexForm" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td colspan=2><input type="button" value="LOGIN" id="login"/></td>
				</tr>
				<tr>
					<td><a href="javascript:void()" id="audio">audio</a></td>
					<td><a href="javascript:void()" id="video">video</a></td>
				</tr>
				<tr>
					<td><a href="javascript:void()" id="fileup">file upload</a></td>
					<td><a href="javascript:void()" id="filedown">file download</a></td>
				</tr>
				<tr>
					<td><a href="javascript:void()" id="imageup">image upload</a></td>
					<td><a href="javascript:void()" id="imagedown">image download</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>