package com.tech.blog.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

//using this annotation i am getting gender in sql and output into console of browser
@MultipartConfig 
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String check = request.getParameter("check");
		
		if(check==null) {
			
			out.println("Terms and conditions not checked");
			
		}else {
			
			String name = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			String gender = request.getParameter("gender");  
			String about = request.getParameter("about");
			
						//			Create user Object and set all data to that Object
			
			User user= new User(name,email,password,gender,about);
			
			
						//			Create UsrDao Object
			
			UserDao dao = new UserDao(ConnectionProvider.getConnection());
			if(dao.saveUser(user)) {
				
				out.println("Done");
			}else {
				out.println("error");
			}
		}
	}

}
