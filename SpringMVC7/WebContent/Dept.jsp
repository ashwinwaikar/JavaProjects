<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dept</title>
</head>
<body>
<h1>Add Product</h1>
<form action="dept.do">
  <label for="location">Enter location:</label><br>
  <input type="text" id="location" name="location"><br>
  <br>
  <input type="submit" value="Submit">
</form>


	<h1>Product list-</h1>
	<%@ taglib prefix="asw" uri="http://java.sun.com/jsp/jstl/core"%>
	<table border="1">
	<tr>
	    <th align="left">Department no</th>
		<th align="left">Department Name</th>
		<th align="left">Location</th>
	</tr>	
	<asw:forEach var="str" items="${department}">
	<tr>
		<td>${str.deptno}</td>
		<td>${str.dname}</td>
		<td>${str.location}</td>
		<tr>
		<br>
	</asw:forEach>
	</table>
</html>
</body>
</html>

