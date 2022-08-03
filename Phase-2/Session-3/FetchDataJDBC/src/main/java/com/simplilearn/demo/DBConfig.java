package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
	
	public static  Connection getConnection(Properties props) {
		
		Connection connection=null;
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce1";
		String username="root";
		String password="Nikunj@123";
		
		
		try {
			//load driver
			Class.forName(driver);
			//get connection and store it con  object
			connection=DriverManager.getConnection(url,username,password);
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return  connection;
	}

}
