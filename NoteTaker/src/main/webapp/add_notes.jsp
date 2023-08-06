<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="css/style.css" rel=stylesheet>
<%@include file="all_js_css.jsp"%>
<title>Add Notes 1009!</title>
</head>

<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Fill your Node Details</h1>
		<br>
		<!-- This is add form -->
		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input required="required"
					name="title" type="text" class="form-control" id="title"
					style="width: 1000px" aria-describedby="emailHelp"
					placeholder="Enter Note Title here"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your Notes
					with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="note-content">Note Content</label>
				<textarea required="required" name="content" id="note-content"
					class="form-control" placeholder="Enter Note Content here"
					style="height: 300px; width: 1000px"></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add Note</button>
			</div>
		</form>
	</div>
</body>
</html>
1
