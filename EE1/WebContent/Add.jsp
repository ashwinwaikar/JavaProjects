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
		<label for="dname">Deptartment Name:</label>
			<br> 
			<input type="text" id="dname" name="dname">
			<br>
		
			<label for="loc">Location:</label>
			<br> 
			<input type="text" id="loc" name="loc">
			<br>
			
			
			<br>
			
			 <br> 
			 <input type="submit"	value="Submit">
		</form>
	</div>
</body>
</html>