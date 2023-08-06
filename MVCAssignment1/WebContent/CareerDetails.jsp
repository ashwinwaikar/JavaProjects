<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="pack1.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarrerDetails</title>
</head>
<body>
	<%-- <%=request.getAttribute("advice")%> --%>
	<%
		CareerExpert c1 = (CareerExpert) request.getAttribute("advice");
		out.print("So our true advice to you is" + " " + c1.getAdvice());
	%>
</body>
</html>