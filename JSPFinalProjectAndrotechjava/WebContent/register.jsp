<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- USE BEAN TAG IS USED TO CREATE OBJECT OF A PERTICULAR CLASS  -->
	<jsp:useBean id="reg" class="beans.RegisterBean" scope="application"></jsp:useBean> <!-- TO CREATE OBJECT OF BEAN(IN THE BEAN THE DATA IS SET FROM JSP)-->
    <jsp:useBean id="regdao" class="dao.RegisterDao"></jsp:useBean> <!-- TO CREATE OBJECT OF DAO -->
	<jsp:setProperty property="*" name="reg"/> <!-- TO GET HTML DATA AND SET INTO THE BEAN--> <!-- * MEANS SARE KE SARE ATTRIBUTES -->


<%
/* out.print(reg);
 */
String msg=regdao.save(reg);//THE BEAN OBJECT IS PASSED TO DAO TO RETRIVE DATA FROM THE BEAN

if(msg.equals("success"))
{
%>
<jsp:forward page="Welcome.jsp"></jsp:forward>	
<% 
}
else{
%>
<jsp:forward page="error.jsp"></jsp:forward>
<%
}
%>
</body>
</html>