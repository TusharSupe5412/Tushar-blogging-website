package com.tech.blog.helper;

import java.sql.*;



public class ConnectionProvider {
		
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
				if(con == null) {
					// Driver class load
					
					Class.forName("com.mysql.jdbc.Driver");
					
					   // Create a Connection
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","123456");
					
				}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}
