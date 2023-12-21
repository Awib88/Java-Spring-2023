<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

	<!--<c:out value="someVariable"/> -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div>
		<h1>Send an Omikuji!</h1>
		<div class="container">
			<form action="/process" method="Post">
				<div class="mb-3">
					  <label for="number" class="form-label">Pick any number from 5 to 25</label>
					  <input type="number" class="form-control" name="number" placeholder="0">
				</div>
				<div class="mb-3">
					  <label for="city" class="form-label">Enter the name of any city</label>
					  <input type="text" class="form-control" name="city" placeholder="city..">
				</div>
				<div class="mb-3">
					  <label for="person" class="form-label">Enter the name of any real person's name</label>
					  <input type="text" class="form-control" name="person" placeholder="ant person's name..">
				</div>
				<div class="mb-3">
					  <label for="hobby" class="form-label">Enter professional endeavor or hobby</label>
					  <input type="text" class="form-control" name="hobby" placeholder="..">
				</div>
				<div class="mb-3">
					  <label for="living" class="form-label">Enter any type of living thing</label>
					  <input type="text" class="form-control" name="living" placeholder="..">
				</div>
				<div class="mb-3">
				  <label for="message" class="form-label">Say something nice to someone:</label>
				  <textarea class="form-control" name="message" rows="3"></textarea>
				</div>
				<p> Send and Show a friend!</p>
				<div class="col-auto">
					<button type="submit" class="btn btn-primary mb-3">Send</button>
  				</div>
			</form>
		</div>
	</div>
</body>
</html>