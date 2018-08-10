
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<a href="/">TOP</a>
</div>
<div class="center">
	<img alt="welcome" src="/resources/images/disp/welcome.jpg"><br>
	welcome:
	<c:out value="${ loginName}" />
	<br> <input type="button" value="click me" id="btn">
</div>