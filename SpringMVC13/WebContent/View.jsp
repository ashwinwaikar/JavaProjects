<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix="asw" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1">
	<tr>
		<th align="left">ProductName</th>
		<th align="left">Price</th>
		<th align="left">Quantity</th>
	</tr>
	<asw:forEach var="comp"  items="${product}">
		<tr>
			<td> ${comp.pname}</td>
			<td> ${comp.price}</td>
			<td> ${comp.qty}</td>
		</tr>
		</asw:forEach>
	</table>
	<br><br>
	<a href="Home.jsp">Go Home</a>
</body>
</html>