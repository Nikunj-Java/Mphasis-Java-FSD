package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String name=req.getParameter("pname");
		BigDecimal price=new BigDecimal(req.getParameter("pprice"));
		
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		Properties props= new Properties();
		props.load(in);
		
		Connection con=DBConfig.getConnection(props);
		
		try {
			//store procedure is already prepared inside
			//mysql database with name add_product
			//check storeprocedure query.txt file for more information
			
			//CallableStatement stmt=con.prepareCall("call add_product(?,?)");
			
			
			PreparedStatement  stmt= con.prepareStatement("insert into eproduct (name,price) values (?,?)");
			
			stmt.setString(1, name);
			stmt.setBigDecimal(2, price);
			
			int x=stmt.executeUpdate();
			
			if(x>0) {
				//out.print("Data  Inserted Successfully");
				resp.sendRedirect("list");
			}
				
			else {
				out.print("Error While  Inserting a Data");
			}
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
