<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:set var="name" value="${param.name }"></c:set>
<c:set var="pass" value="${param.pass }"></c:set>
<c:set var="pass1" value="admin123"></c:set>

<!-- If and Else -->
<c:choose>

		<c:when test="${fn:contains(pass,pass1)}">
			<c:set var="uname" value="${name }" scope="session"></c:set>
			<jsp:forward page="success.jsp"></jsp:forward>
		
		</c:when>
		
		<c:otherwise>
			<h3>Wrong username and paswword</h3>
			<jsp:include page="index.html"></jsp:include>
		</c:otherwise>
		

</c:choose>

</body>
</html>