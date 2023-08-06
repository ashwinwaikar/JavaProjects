<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<div align="center">
		<h2>Please Register by filling form</h2>

		<form action="RegisterServ1" method="post">
		<label for="id">Id:</label>
			<br> 
			<input type="text" id="id" name="id">
			<br>
		
			<label for="name">Name:</label>
			<br> 
			<input type="text" id="name" name="name">
			<br>
			
			<label for="address">Address:</label>
			<br> 
			<input type="text" id="address" name="address">
			<br>
			
			<label for="emailid">Email id:</label>
			<br> 
			<input type="text" id="emailid" name="emailid">
			<br>
			
			<label for="login">Login:</label>
			<br> 
			<input type="text" id="login" name="login">
			<br>
			
			<label for="password">Password:</label>
			<br> 
			<input type="text" id="password" name="password">
			<br>
			 <br> 
			 <input type="submit"	value="Submit">
		</form>
	</div>
</body>
</html>