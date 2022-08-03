package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/connect")
public class DBConnect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=resp.getWriter();
		
		Properties props=new Properties();
		
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		Connection conn=DBConfig.getConnection(props);
		
		if(conn!=null)
			out.print("Connection is established");
		else
			out.print("Error  While  Connecting");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
