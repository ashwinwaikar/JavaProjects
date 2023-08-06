<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
<h1>We have following Companies for Placements</h1>
	<table border="1">
	<tr>
		<th align="left">name</th>
		<th align="left">location</th>
	</tr>
	<c:forEach var="comp"  items="${mylist}">
		<tr>
			<td> ${comp.name}</td>
			<td> ${comp.location}</td>
			<td><a href="delete.do?id=${comp.cid}">Delete</a>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="Home.jsp">Go Home</a>
</body>
</html>



