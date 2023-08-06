<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h1>Add Product</h1>
<form:form method="post" modelAttribute="addproduct">

Product Name<br>
<form:input path="pname"/> <br><br>

Price<br><br>
<form:input path="price"/><br><br>

Quantity<br><br>
<form:input path="qty"/><br><br>

<input type=submit value="Add_Product"/>
</form:form>	
</body>
</html>

