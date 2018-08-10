
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<a href="/">TOP</a>
</div>
<form:form action="/upload/imageup" method="post"
	enctype="multipart/form-data">
	<div style="font-size: 0.5em;">
		<input type="file" name="imageup" /><br> <input type="submit"
			id="upload" value="upload" />
	</div>
</form:form>