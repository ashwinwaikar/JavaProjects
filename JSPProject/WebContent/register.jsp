
<%@page import="java.sql.PreparedStatement"%>
<%@page import="mysqlconnection.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Connection conn = null;
	try {
		String name = request.getParameter("name");
		String password = request.getParameter("psw");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		conn = ConnectionProvider.factorymethod();

		PreparedStatement stmt = conn.prepareStatement("insert into register values(?,?,?,?)");
		stmt.setString(1, name);
		stmt.setString(2, password);
		stmt.setString(3, email);
		stmt.setString(4, mobile);

		int i = stmt.executeUpdate();
		if (i > 0) {
			out.println("Record Inserted Succesfully");

		} else
			out.println("Something Went Wrong");
	} catch (Exception e) {
		System.out.println(e);
	}
	%>
</body>
</html>