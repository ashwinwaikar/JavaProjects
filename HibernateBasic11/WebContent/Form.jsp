<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>

<div align="center">
		<h2>Please fill this form</h2>

		<form action="CourseServ" method="post">
		<label for="course">Course Name:</label>
			<br> 
			<input type="text" id="course" name="course">
			<br>
		
			<label for="module1">Module1 Name:</label>
			<br> 
			<input type="text" id="module1" name="module1">
			<br>
			
			<label for="module2">Module2 Name:</label>
			<br> 
			<input type="text" id="module2" name="module2">
			<br>
			
			<label for="module3">Module3 Name:</label>
			<br> 
			<input type="text" id="module3" name="module3">
			<br>
			 <br> 
			 <input type="submit"	value="Submit">
		</form>
	</div>
</body>
</html>