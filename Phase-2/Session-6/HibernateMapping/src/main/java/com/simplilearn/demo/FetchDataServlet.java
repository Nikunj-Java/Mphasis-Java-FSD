package com.simplilearn.demo;

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

import org.apache.catalina.connector.Response;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchDataServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			
			SessionFactory factory=HibernateUtils.getSessionFactory();
			
			Session session= factory.openSession();
			
			List<Eproduct> list=session.createQuery("from Eproduct").list();
			
			
			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			
			out.print("<html><body>");
			out.println("<b>Product List</b><br>");
			
			
			for(Eproduct p:list) {
				out.print("Id: "+String.valueOf(p.getID()+", Name:"+p.getName()+",Price:"+p.getPrice()
				
						+",DateAdded: "+p.getDateAdded().toString()));
				
				
				Collection <ScreenSize> sizes= p.getScreensize();
				out.println(",ScreenSizes: ");
				
				for(ScreenSize s: sizes) {
					out.print(s.getSize()+"&nbsp;");
				}
				
				Set<OS>os=p.getOs();
				out.print(",OS: ");
				for(OS o:os) {
					out.print(o.getName()+"&nbsp;");
				}
				
				Map finance=p.getFinance();
				out.print(",Finance Options: ");
				 
				
				if(finance.get("CREDITCARD")!=null) {
					Finance f= (Finance) finance.get("CREDITCARD");
					out.println(f.getName()+"$nbsp");
				}
				if(finance.get("BANK")!=null) {
					Finance f= (Finance) finance.get("BANK");
					out.println(f.getName()+"$nbsp");
				}
				
				out.print("<hr>");
			}
			
			out.print("</body></html>");
			session.close();
			
			for(Eproduct p:list) {
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}
