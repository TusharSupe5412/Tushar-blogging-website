
<%@ page import="com.tech.blog.entities.*" %>
<%@ page errorPage="error.jsp" %>
<%@ page import="com.tech.blog.dao.*" %>
<%@ page import="com.tech.blog.helper.*" %>
<%@ page import="java.util.ArrayList" %>


<%

User user = (User)session.getAttribute("currentUser");

if(user==null){
	
	response.sendRedirect("login_page.jsp");
	
}else{
	
	
}


%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.*"%>    
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
	
	body{
		background: url(img/2.jpg);
		background-size: cover;
		background-attachment: fixed;
	}

</style>
</head>
<body>

								<!-- Navbar starts here -->
								
								  <nav class="navbar navbar-expand-lg navbar-dark primary-background">
  <a class="navbar-brand" href="index.jsp"><span class="fa fa-asterisk"></span> Tech Blog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#"><span class="fa fa-bell-o"></span> Full Stack Development With Tushar<span class="sr-only">(current)</span></a>
      </li>
     
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="	fa fa-check-square-o"></span>
          Catagory
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming language</a>
          <a class="dropdown-item" href="#">Small Projects implementation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Implement OOPS using JAVA with Data Structures and Beyond</a>
          <a class="dropdown-item" href="#">Become a back-end expert</a>
          <a class="dropdown-item" href="#">Implement Frameworks the DevOps way</a>
          <a class="dropdown-item" href="#">Develop a Web Application using frontend stack</a>
          <a class="dropdown-item" href="#">Testing in a DevOps Lifecycle</a>
          <a class="dropdown-item" href="#">Data structure</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Full Stack Java Developer Capstone Project</a>
          
          
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#"><span class="fa fa-address-card-o"></span> Contact us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post-modal"><span class="fa fa-paw"></span> Do Post </a>
      </li>
      
    </ul>
    <ul class="navbar-nav mr-right">
    	<li class="nav-item">
        <a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span> <%= user.getName() %></a>
       </li>
    	<li class="nav-item">
        <a class="nav-link" href="LogoutServlet"><span class="fa fa-user-plus"></span> Logout</a>
      </li>
    </ul>
  </div>
</nav>
								 
								
								
							   <!-- Navbar ends here -->
							   
							<%
							Message m=(Message)session.getAttribute("msg");
							
							if(m!=null)
							{
								%>
								<div class="alert <%= m.getCssClass() %>" role="alert">
								  <%= m.getContent() %>
								</div>
								
								
								<%
								
								session.removeAttribute("msg");
							}
							
							
							%>		
							
							
							<!--Main Body of page  -->	
							
		<main>
			<div class="container"> 
				<div class="row mt-4">
					<!--First column  -->
					<div class="col-md-4">
						<!-- Categories -->
					<div class="list-group">
					  <a href="#" onclick="getPosts(0,this)" class=" c-link list-group-item list-group-item-action active">
					    All Posts
					  </a>
					  <!-- Categories -->
					  
					  <%
					  PostDao d = new PostDao(ConnectionProvider.getConnection());
					  
					  ArrayList <Category> list1 = d.getAllCategories();
					  for(Category cc : list1){
						  
						  %>
						  
						  <a href="#" onClick="getPosts(<%= cc.getCid() %>,this)" class=" c-link list-group-item list-group-item-action"><%= cc.getName() %></a>
						  
						  
						  <% 
						  
					  }
					  %>
					  
					</div>
					
					</div>
					
					<!--Second column  -->
					<div class="col-md-8">
						<!--posts   -->
						<div class="container text-center" id="loader">
							<i class="fa fa-refresh fa-4x fa-spin "></i>
							<h3 class="mt-2">Loading...</h3>
						</div>
						
						<div class="container-fluid" id="post-container">
						
						
						</div>
						
						
					</div>
				
				</div>
			
			</div>
		
		
		
		</main>					
							
							
							<!-- End of main body of page  -->		   
								
								
								<!--Profile Modal  -->


		
		<!-- Modal -->
		<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header primary-background text-white text-center">
		        <h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <div class="container text-center">
		        	<img src="pics/<%= user.getProfile() %>"class="img-fluid" style="border-radius: 50%; max-width: 150px;" >
		        	<br>
		           <h5 class="modal-title" id="exampleModalLabel"><%= user.getName() %></h5>
		           
		          	<div id="profile-details">							 <!--Details  -->
		          	<table class="table">
					  
					  <tbody>
					    <tr>
					      <th scope="row"> ID </th>
					      <td><%= user.getId() %></td>
					      
					    </tr>
					    <tr>
					      <th scope="row"> Email ID </th>
					      <td><%= user.getEmail() %></td>
					      
					    </tr>
					    <tr>
					      <th scope="row">Password</th>
					      <td><%= user.getPassword() %></td>
					      
					    </tr>
					    <tr>
					      <th scope="row">Gender</th>
					      <td><%= user.getGender() %></td>
					      
					    </tr>
					    <tr>
					      <th scope="row"> Status </th>
					      <td><%= user.getAbout() %></td>
					      
					    </tr>
					    <tr>
					      <th scope="row"> Registered on </th>
					      <td><%= user.getDateTime().toString() %></td>
					      
					    </tr>
					  </tbody>
					  
					</table>								 
		          	</div>									 
		          									 
		          									<!--  Details end here -->
		          									
		          									<!-- profile edit -->
		          <div id="profile-edit" style="display: none;">
		          	<h3 class="mt-2" >Please Edit carefully !!!</h3>
		            
		            <form action="EditServlet" method="post" enctype="multipart/form-data">
		            	<table class="table">
		            		<tr>
		            			<td> ID </td>
		            		    <td><%= user.getId() %></td>
		            		</tr>
		            		<tr>
		            			<td> Email ID  </td>
		            		    <td><input type="email" name="user_email" value="<%= user.getEmail() %>"></td>
		            		</tr>
		            		<tr>
		            			<td> Name  </td>
		            		    <td><input type="text" name="user_name" value="<%= user.getName() %>"></td>
		            		</tr>
		            		<tr>
		            			<td> Password  </td>
		            		    <td><input type="password" name="user_password" value="<%= user.getPassword() %>"></td>
		            		</tr>
		            		<tr>
		            			<td> Gender </td>
		            		    <td><%= user.getGender().toUpperCase() %></td>
		            		</tr>
		            		
		            		<tr>
		            			<td> About </td>
		            		    <td>
		            		    	<textarea class= "form-control" name="user_about" rows="5" ><%= user.getAbout() %></textarea>
		            		    </td>
		            		</tr>
		            		<tr>
		            			<td> New pic </td>
		            		    <td><input class= "form-control" type="file" name="image" value="<%= user.getProfile() %>"></td>
		            		</tr>
		            		
		            	
		            	</table>
		            
		            	<div class="container">
		            	
		            		<button type="submit" class="btn btn-outline-primary"> Save</button>
		            	</div>
		            
		            
		            </form>
		          
		          
		          </div>									
		          									
		          									
		          									
		          									<!-- profile edit ends here-->
		          									
		          									
		          									
		        </div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		        <button id="edit-profile-button" type="button" class="btn btn-primary">Edit</button>
		      </div>
		    </div>
		  </div>
		</div>
								
								

								<!-- End of profile modal -->
								
								<!-- Post Modal Start here -->
		
<!-- Modal -->
<div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Provide the post details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        
        <form id="add-post-form" action="AddPostServlet" method="post">
        
        	<div class="form-group" >
        		<select class="form-control" name="cid">
        		
        			<option selected disabled>-------Select your Category-------</option>
        			
        			<%
        				PostDao postd = new PostDao (ConnectionProvider.getConnection());
        				
        				ArrayList <Category> list = postd.getAllCategories();
        			
        				for(Category c : list){
        					
        					
        			%>
        			
        			
        			<option value="<%= c.getCid() %>"><%= c.getName() %></option>
        			
        		<%
        				}
        		%>
        		
        		</select>
        	</div>
        	<div class="form-group">
        		<input name="pTitle" type="text" placeholder="Enter post title" class="form-control "/>
        	</div>
        
        	<div class="form-group">
        		<textarea name="pContent" rows="5" style="height: 300px" class="form-control" placeholder="Enter your content here..."></textarea>
        	</div>
        	
        	<div class="form-group">
        		<textarea name="pCode" rows="5" style="height: 200px" class="form-control" placeholder="Enter your code here (if any)"></textarea>
        	</div>
        	
        	<div class="form-group">
        		<label>Select your pic </label>
        		<br>
        		<input name="pic" type="file" class="form-control "/>
        	</div>
        	
        	<div class="container text-center">
        		<button type="submit" class="btn btn-outline-primary">Post</button>
        	</div>
        
        </form>
        
        
      </div>
      
    </div>
  </div>
</div>		          									
		          			  <!-- Post Modal ends here -->




 <!-- Java Script -->
  
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script src="js/myjs.js" type="text/javascript"></script>	

<script>
	$(document).ready(function(){
		
		let editStatus = false;
		
		$('#edit-profile-button').click(function(){
			
			if(editStatus==false){
				$("#profile-details").hide()
				$("#profile-edit").show()
				editStatus=true;
				$(this).text("Back")
			}
			else{
				$("#profile-details").show()
				$("#profile-edit").hide()
				editStatus= false;
				$(this).text("Edit")


			}
		})
	});
</script>

									<!-- Now add post JS -->


	<script>
		$(document).ready(function(e){
			
			$("#add-post-form").on("submit",function(event){
				/* Above function get called when form is submitted */
				
				event.preventDefault();
				
				console.log("you have clicked on submit...");
				
				let form = new FormData(this);
				
				/* Now requesting to server  */
				
				$.ajax({
					url:"AddPostServlet",
					type:'POST',
					data: form,
					success: function (data, textStatus, jqXHR){
						/*  Sucsess....*/
						console.log(data); 
						
						if(data.trim()=='done'){
							
							swal("Good job!", "Saved Successfully", "success");

						}else{
							
							swal("Error!!", "Something went wrong try again...", "error");

						}
					},
					error: function (jqXHR, textStatus, errrThrown){
						/* Error */
						
						swal("Error!!", "Something went wrong try again...", "error");
						
					},
					
					processData: false,
					contentType: false
				})
			})
		})
	</script>	
	
	
								<!-- Loading posts Using Ajax-->	
								
   <script>
   
   			function getPosts(catId,temp){
   				$("#loader").show();
   				$("#post-container").hide();
   				
   				$(".c-link").removeClass('active')
   				
				$.ajax({
   					
   					url: "load_posts.jsp",
   					data: {cid: catId} ,
   					success: function (data , textStatus, jqXHR){
   						console.log(data);
   						
   					$("#loader").hide();
   	   				$("#post-container").show()

   					
   					$('#post-container').html(data)
   					
   					$(temp).addClass('active')
   						
   					},
   					
   				})
   				
   				
   			}
   
   			$(document).ready(function(e){
   				
   				let allPostRef=$('.c-link')[0]
   				
   				getPosts (0, allPostRef)
   				
   				
   				
   			})
   			
   
   
   </script>									


	
	
	
	
	
	
	
	
	
	
</body>
</html>