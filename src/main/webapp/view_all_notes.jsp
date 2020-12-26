<%@page import="com.helper.FactoryProvider"%>

<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.entities.Note"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Note Tracker:All Notes</title>
<%@ include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<br>
		<h1 class=text-uppercase>All Notes:</h1>

		<div class="row">
			<div class="col-12">
				<%
					Session s = FactoryProvider.getFactory().openSession();
					Query q = s.createQuery("From Note");
					List<Note> noteList = q.list();

					for (Note note : noteList) {
				%>
				
				<div class="card  mt-3 ">
					<img class="card-img-top m-4 mx-auto" src="img/notes.png" alt="Card image cap" style="max-width: 100px">
					<div class="card-body">
					<div class="container text-center mt-3">
						<h5 class="card-title p-4"><%=note.getTittle()%></h5>
						<p class="card-text"><%=note.getContent()%>>
						</p>
						
						<a href="#" class="btn btn-danger">Delete</a>
						<a href="#" class="btn btn-primary">Edit</a>
						</div>
					</div>
				</div>
				<%
					}
					s.close();
				%>

			</div>
		</div>
		<br>




	</div>

</body>
</html>