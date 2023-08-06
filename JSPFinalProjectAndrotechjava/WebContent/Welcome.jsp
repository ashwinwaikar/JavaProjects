<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
WELCOME BABU BHAIYYYAAA....
<jsp:useBean id="reg" class="beans.RegisterBean" scope="application"></jsp:useBean>
<jsp:getProperty property="name" name="reg"/>
<jsp:getProperty property="psw" name="reg"/>
<jsp:getProperty property="email" name="reg"/>
<jsp:getProperty property="mobile" name="reg"/>
</body>
</html>