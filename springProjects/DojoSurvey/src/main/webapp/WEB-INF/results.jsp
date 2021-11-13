<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div>
<!-- This is the Flash Message -->
	<c:out value="${message}"/>
</div>
<div class="container pt-2 border">
		<c:forEach var="item" items="${survey_results}">
		<div class="form-group row">
	    	<label for="name" class="col-sm-2 col-form-label">Your Name:</label>
	    	<div class="col-sm-10">
	      		<p><c:out value="${item.fullName}" /></p>
	    	</div>
	  	</div>
		<div class="form-group-row">
			<label class="col-sm-2 col-form-label" for="dojo_location">Dojo Location:</label>
	    	<div class="col-sm-10">
	      		<p><c:out value="${item.location}" /></p>
	    	</div>
		 </div>
		<div class="form-group-row">
			<label class="col-sm-2 col-form-label" for="favorite_language">Favorite Language:</label>
	    	<div class="col-sm-10">
	      		<p><c:out value="${item.language}" /></p>
	    	</div>
		 </div>
		 <div class="form-group-row">
		 	<label class="col-sm-2 col-form-label" for="comment_textarea">Comment (optional):</label>
	    	<div class="col-sm-10">
	      		<p><c:out value="${item.comment}" /></p>
	    	</div>
	    </div>
	    </c:forEach>
		<div>
			<a href="/" class="btn btn-secondary mt-2" role="button">Go Back</a>
		</div>
</div>
</body>
</html>