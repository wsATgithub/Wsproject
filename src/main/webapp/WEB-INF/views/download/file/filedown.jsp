<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
	<a href="/">TOP</a>
</div>
<div>
	<c:forEach var="item" items="${fileList}">
		<a href="/download/filedown?filename=${item}">${item}</a>
		<br>
	</c:forEach>
</div>