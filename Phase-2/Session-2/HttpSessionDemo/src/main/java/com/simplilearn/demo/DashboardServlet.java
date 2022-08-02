package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		PrintWriter out=  resp.getWriter();
		
		//neededto read html type
		resp.setContentType("text/html");
		
		
		HttpSession session= req.getSession(false);
		
		
		if(session!=null) {
			
			String userFromSession=(String) session.getAttribute("key");
			
			if(userFromSession!=null) {
				out.print("User Exist "+userFromSession);
				out.print("<a href='logout'>Logout</a>");
			}
			
		}
		else {
			out.print("Kindly Login First");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}
