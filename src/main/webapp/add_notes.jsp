<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Note</title>

<%@ include file="all_js_css.jsp"%>


</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<br>
		<div class="container" >
		<h1>Please fill your Note details</h1>
		<!--This is Add Note form page  -->

		<form action = saveNotesServlet method="post">
			<div class="mb-3">
				<label for="tittle" class="form-label">Note
					Tittle</label> <input name = "tittle" required="required" type="text" class="form-control"
					id="tittle" placeholder=""   aria-describedby="emailHelp">
			
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea name = "content"  required="required" id = "content" placeholder="Enter your content here"
				class="form-control"
				style="height: 300px"></textarea>
				
			</div>
		  <div class="container text-center" >
			<button type="submit" class="btn btn-primary">Add Note</button>
			</div>
		</form>
		</div>
	</div>


</body>
</html>