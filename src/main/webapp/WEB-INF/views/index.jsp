<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="body">
	<form:form modelAttribute="indexForm" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>PASS:</td>
				<td><form:input path="pass" /></td>
			</tr>
			<tr>
				<td colspan=2><input type="button" value="LOGIN" id="login" /></td>
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
				<td><a href="javascript:void()" id="imagedown">image
						download</a></td>
			</tr>
		</table>
	</form:form>
</div>