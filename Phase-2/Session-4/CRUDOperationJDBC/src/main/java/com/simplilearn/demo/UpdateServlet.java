package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("id");
		
		//converting string to int
		int  id=  Integer.parseInt(param);
		
		String name=req.getParameter("pname");	
		BigDecimal price=new BigDecimal(req.getParameter("pprice"));
		
		Properties props= new Properties();
		
		InputStream  in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	
		Connection  conn=DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				
				//update operation
				PreparedStatement  stmt= conn.prepareStatement("update eproduct set name=?,price=? where id=?");
				
			
				stmt.setString(1, name);
				stmt.setBigDecimal(2, price);
				stmt.setInt(3, id);
				int rs=stmt.executeUpdate();
				
				
				
				if(rs>0) {
					System.out.println(rs+ "Row updated successfully");
					 resp.sendRedirect("list");
				}else {
					System.out.println("Error  while updating data");
					resp.sendRedirect("index.html");
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}
