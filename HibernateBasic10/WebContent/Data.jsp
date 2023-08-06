<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data</title>
</head>
<body>
	<div align="center">
		<h2>Please Register by filling form</h2>

		<form action="DataServlet">
			<label for="location">Enter location name:</label> <br> <input
				type="text" id="location" name="location"> <br> <br>
			<input type="submit" value="Submit">
		</form>
	</div>
	<div>
	<%@ taglib prefix="asw" uri="http://java.sun.com/jsp/jstl/core"%>
	<asw:forEach var="str" items="${requestScope.mylist1}">
		<div align="center">
		<h1 align="center">So the record is-</h1>
			<b>${str}<b> <br>
		</div>
	</asw:forEach>
	</div>
</body>
</html>