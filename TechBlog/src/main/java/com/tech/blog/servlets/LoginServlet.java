package com.tech.blog.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		login----->> fetch user name and password from request
		
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		
		UserDao dao= new UserDao(ConnectionProvider.getConnection());
		
		User u = dao.getUserByEmailAndPassword(userEmail, userPassword);
		
		if(u==null) {
//			login error
			
//			alert-danger is from bootstrap alerts
			
			Message msg = new Message("Invalid details...try again","error","alert-danger");
			
			HttpSession s = request.getSession();
			s.setAttribute("msg",msg);
			response.sendRedirect("login_page.jsp");
			
			
		}else {
//			login success
			
			HttpSession s = request.getSession();
			s.setAttribute("currentUser", u);
			response.sendRedirect("profile.jsp");
			
			
			
		}
	}

}
