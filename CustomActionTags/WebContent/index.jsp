<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/math.tld" prefix="maths"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	%>
	<maths:sum num1="<%=n1%>" num2="<%=n2%>">
		<br>
	THIS IS THE BODY OF CUSTOM ACTION TAG
	</maths:sum>
	<br>
	<br> THIS IS THE REST PART OF JSP
</body>
</html>