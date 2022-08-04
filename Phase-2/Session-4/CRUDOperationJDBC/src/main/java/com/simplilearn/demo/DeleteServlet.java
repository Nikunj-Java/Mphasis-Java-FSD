package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub


		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("id");
		//converting string to int
		int  id=  Integer.parseInt(param);
		
		Properties props= new Properties();
		
		InputStream  in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	
		Connection  conn=DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				
				
				PreparedStatement stmt=conn.prepareStatement("delete from eproduct where id=?");
				stmt.setInt(1, id);
				
				int rs=stmt.executeUpdate();
				
				if(rs>0) {
					
					System.out.println(rs+"  deleted from database");
					resp.sendRedirect("list");
				}
				else {
					System.out.println("Error while deleting a data");
					resp.sendRedirect("list");
				}
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			out.println("Error while Connecting");
		}
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
	
}
