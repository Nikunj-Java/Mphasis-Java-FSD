package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dboperation")
public class DBOperationServlet  extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out=resp.getWriter();
		//to read and show html content on web page this is required
		resp.setContentType("text/html");
		
		InputStream input=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		Properties props=  new Properties();
		props.load(input);
		
		
		Connection conn=DBConfig.getConnection(props);
		
		try {
			
			
			Statement stmt=conn.createStatement();
			
			
			//SQL  query
			int  x= stmt.executeUpdate("create database demos");
			
			if(x>0)
				out.print("Database Created Successfully<br>");
			else
				out.print("Database already exist<br>");
			
			//SQL  query
			stmt.execute("use demos");
			
			out.print("Database is Selected<br>");
			
			//SQL  query
			stmt.execute("drop database demos");
			
			out.print("Database Dropped Successfully<br>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
