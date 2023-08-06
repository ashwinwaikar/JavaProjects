<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
<link href="css/style.css" rel=stylesheet>
</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Edit Your Note</h1>
		<br>
		
		<%
		int noteId=Integer.parseInt(request.getParameter("note_id").trim());

		Session s=FactoryProvider.getFactory().openSession();
		
		Transaction tx=s.beginTransaction();
		
		//To get a perticular note so that we can update it 
		Note note=(Note)s.get(Note.class, noteId);
		
		%>


		<form action="UpdateServlet" method="post">
		
		<input value="<%=note.getId()%>" name="noteId" type="hidden"/>
		
			<div class="form-group">
				<label for="title">Note Title</label> <input required="required"
					name="title" type="text" class="form-control" id="title"
					style="width: 1000px" aria-describedby="emailHelp"
					placeholder="Enter Note Title here"
					value="<%=note.getTitle() %>"
					> 
			</div>
			<div class="form-group">
				<label for="note-content">Note Content</label>
				<textarea required="required" name="content" id="note-content"
					class="form-control" placeholder="Enter Note Content here"
					style="height: 300px; width: 1000px"><%=note.getContent() %>
					</textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save Note</button>
			</div>
		</form>
	</div>

</body>
</html>