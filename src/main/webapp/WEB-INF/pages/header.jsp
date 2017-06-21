<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#collapse-example" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
			<div class="navbar-header">

				<a class="navbar-brand" href="#"><img src="resources/images/ast.jpg" alt="NIIT" height="30px" width="30px"></a>
			</div>
			<div class="collapse navbar-collapse" id="collapse-example">
			<ul class="nav navbar-nav">
			<li class="active"><a href="home.html">Home<span class="sr-only">You are in home page link</span></a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Add Product</a></li>
			
			<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">dropdown<span class="caret"></span></a>
			<ul class="dropdown-menu">
			<li><a href="#">Edit</a></li>
			<li><a href="#">Delete</a></li>
			<li><a href="#">View</a></li>
			</ul>
			</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Login</a> </li>
			<li><button class="btn btn-default">sign out</button></li>
			</ul>
			</div>
		</div>
	</nav>
</body>
</html>