<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewRegister</title>
</head>
<body>
	<h1 align="center">Register People list-</h1>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:forEach var="str" items="${requestScope.viewing}">
		<div align="center">
			<b>${str}<b> <br>
		</div>
	</c:forEach>
	<div align="center">
		<b><h1>
				<a href="Home.jsp">Go home</a>
			</h1>
	</div>
</body>
</html>