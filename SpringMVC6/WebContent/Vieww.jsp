<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product list-</h1>
	<%@ taglib prefix="asw" uri="http://java.sun.com/jsp/jstl/core"%>
	<table border="1">
	<tr>
	    <th align="left">Product_ID</th>
		<th align="left">Product_name</th>
		<th align="left">price</th>
		<th align="left">Quantity</th>
	</tr>	
	<asw:forEach var="str" items="${viewproduct}">
	<tr>
		<td>${str.pid}</td>
		<td>${str.pname}</td>
		<td>${str.price}</td>
		<td>${str.qty}</td>
		<tr>
		<br>
	</asw:forEach>
	</table>
</body>
</html>