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
<div class="container pt-2 border">
	<form method="POST" action="/results">
		<div class="form-group row">
	    	<label for="name" class="col-sm-2 col-form-label">Your Name:</label>
	    	<div class="col-sm-10">
	      		<input type="text" class="form-control" name="full_name">
	    	</div>
	  	</div>
		<div class="form-group-row">
			<label class="col-sm-2 col-form-label" for="dojo_location">Dojo Location:</label>
			<select class="custom-select my-1 mr-sm-2" name="dojo_location">
			  	<option selected>Choose...</option>
			  	<option value="San Jose">San Jose</option>
			  	<option value="Austin">Austin</option>
			  	<option value="New York">New York</option>
			</select>
		 </div>
		<div class="form-group-row">
			<label class="col-sm-2 col-form-label" for="favorite_language">Favorite Language:</label>
			<select class="custom-select my-1 mr-sm-2" name="favorite_language">
			  	<option selected>Choose...</option>
			  	<option value="Python">Python</option>
			  	<option value="Javascript">Javascript</option>
			  	<option value="Java">Java</option>
			</select>
		 </div>
		 <div class="form-group-row">
		 	<label class="col-sm-2 col-form-label" for="comment_textarea">Comment (optional):</label>
	    	<textarea class="form-control" name="comment_textarea" rows="3"></textarea>
		</div>
		<div>
			<button type="submit" class="btn btn-secondary mt-2">Button</button>
		</div>
	</form>
</div>
</body>
</html>