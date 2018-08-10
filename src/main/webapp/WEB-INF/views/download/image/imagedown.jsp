<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
	<a href="/">TOP</a>
</div>
<div>
	<c:forEach var="item" items="${imageList}">
		<a href="/download/imagedown?image=${item}">${item}</a>
		<br>
	</c:forEach>
</div>