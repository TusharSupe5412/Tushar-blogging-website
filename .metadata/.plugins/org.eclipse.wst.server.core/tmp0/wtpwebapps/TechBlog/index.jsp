

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import = "com.tech.blog.helper.*" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
		
	.banner-background{
	
		clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);
	}

</style>
</head>
<body>

						<!-- Navbar -->  
		
		<%@ include file="normal_navbar.jsp"%>
		
						<!--  Banner  -->
	<div class="container-fluid p-0 m-0">
		
		<div class="jumbotron primary-background text-white banner-background">
			<div class="container" >
				<h3 class="display-3">Welcome to tech blog</h3>
				<p>Welcome to technical blog of full stack development. A web developer is a programmer or a coder who specializes in, or is specifically engaged in, the development of World Wide Web applications using a client-server model. The applications typically use HTML, CSS and JavaScript in the client, PHP, ASP.NET (C#), Python, Node.js, Go or Java in the server. A web developer may specialize in client-side applications (front-end developer), server-side applications (back-end developer), or both (full-stack developer).</p>
			
			
				<a href="register.jsp " class="btn btn-outline-light btn-lg"> <span class="fa fa-user-plus"></span> Start ! its Free</a>
				<a href="login_page.jsp " class="btn btn-outline-light btn-lg"> <span class="fa fa-user-circle fa-spin"></span> Login</a>
				
			</div>
	   </div>
  </div>
  
  						<!-- Cards  -->
  					
  	<div class="container">
  		
  		<div class="row mb-2">
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Implement OOPS using JAVA</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Become a back-end expert</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Implement Frameworks</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  				
  		<div class="row mt-2">
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Implement OOPS using JAVA</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Implement OOPS using JAVA</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  				<div class="col-md-4">
  					<div class="card">
						  
						  <div class="card-body container-fluid">
						    <h5 class="card-title">Implement OOPS using JAVA</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn primary-background text-white">Read more</a>
						  </div>
					</div>
  				</div>
  			
  		
  		</div>
  	
  	
  	
  	</div>				
  	</div>
  
  
  
  
  
  
  
  
  <!-- Java Script -->
  
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>


<!-- This is for checking jquery working or not -->
<!-- <script>
	$(document).ready(function (){
		alert("document loaded")
	})

</script>
 -->
</body>
</html>