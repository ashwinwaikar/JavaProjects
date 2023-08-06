<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>
<body>
<div align="center">
		<h2>Please Register by filling form</h2>

		<form action="AddServlet" method="post">
		<label for="name">Enter student name:</label>
			<br> 
			<input type="text" id="name" name="name">
			<br>
			<label for="address">Enter student address:</label>
			<br> 
			<input type="text" id="address" name="address">
			<br>
			<label for="cars">Choose persistence store:</label>
  			<select id="dropdown" name="dropdown">
    		<option value="filesystem">File System</option>
    		<option value="database">Database</option>
    		</select>
			 <br>
			 <br>
			 <input type="submit"	value="Submit">
		</form>
	</div>
</body>
</html>