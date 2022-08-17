<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>ECommerce Products </h1>

<table>
	<tr><th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th></tr>
	<c:forEach var="p" items="${list }">
	
		<tr>
			<td>${p.id }</td>
			<td>${p.name }</td>
			<td>${p.price }</td>
			<td>${p.dateAdded }</td>
		
		</tr>
	
	</c:forEach>
	
	

</table>

</body>
</html>