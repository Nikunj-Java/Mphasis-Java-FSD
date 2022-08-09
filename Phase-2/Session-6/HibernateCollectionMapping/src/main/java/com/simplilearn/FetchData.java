package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		SessionFactory factory=HibenateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<EProduct> list= session.createQuery("from EProduct").list();
		
		for(EProduct product:list) {
			out.print("<br>");
			out.print("Id:"+product.getID()+"<br>");
			out.print("Name:"+product.getName()+"<br>");
			out.print("Price: "+product.getPrice()+"<br>");
			out.print("Available from: "+product.getDateAdded()+"<br>");
			
			out.print("Color Details:<br>");
			
			List<Color> colors=product.getColors();
			
			for(Color c:colors) {
				out.print("Color Name: "+c.getName()+"<br>");
				
			}
			
			out.print("ScreenSize Details:<br> ");
			
			Collection<ScreenSizes> screen=product.getScreensizes();
			
			for(ScreenSizes sc:screen) {
				out.print("Size: "+sc.getSize()+"<br>");
			}
			
			
			
			out.print("OS Details: ");
			
			Set<OS>os=product.getOs();
			for(OS o:os) {
				out.print("OS: "+o.getName());
			}
			
			out.print("Finance Deatils:");
			
			Map finance= product.getFinance();
			
			if(finance.get("CREDITCARD")!=null) {
				Finance f=(Finance) finance.get("CREDITCARD");
				f.getName();
			}
			if(finance.get("BANK")!=null) {
				Finance f=(Finance) finance.get("BANK");
				f.getName();
			}
			
			out.print("<br>-------------------------------------------<br>");
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
