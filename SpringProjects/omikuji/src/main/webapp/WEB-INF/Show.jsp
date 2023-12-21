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
	 <div class="container">

	 	<div class="card">
			<div class="card-body">
			    <h5 class="card-title">Here's your Omikuji!!</h5>
			    
			    <p class="card-text">
			    In <c:out value="${result[0]}"/> years you will live in <c:out value="${result[1]}"/> with <c:out value="${result[2]}"/> as your roommate, <c:out value="${result[3]}"/> . The next time you see a <c:out value="${result[4]}"/>, you will have good luck. Also,<c:out value="${result[5]}"/> .
			    </p>
			    
			    <a href="/" class="card-link">Go Back</a>
			</div>
		</div>
	 </div>
</body>
</html>