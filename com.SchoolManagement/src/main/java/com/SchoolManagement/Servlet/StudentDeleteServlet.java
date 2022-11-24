package com.SchoolManagement.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolManagement.Serveice.AdminService;

@WebServlet(value ="/delete")
public class StudentDeleteServlet extends HttpServlet {
	AdminService adminService = new AdminService();
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rno =  req.getParameter("rno1");
		
		PrintWriter pw = resp.getWriter();
		
		if (adminService.deleteStudent(rno)) {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('data deleted Succenfully');");
			pw.println("</script>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("admin-home.jsp");
			dispatcher.include(req, resp);
			
		}else{
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('data not deleted ');");
			pw.println("</script>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("admin-home.jsp");	
			dispatcher.include(req, resp);

			
		}
		
	}

}
