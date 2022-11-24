package com.SchoolManagement.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolManagement.DTO.student;
import com.SchoolManagement.Serveice.AdminService;

@WebServlet(value = "/update")
public class StudentUpdateServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rno = req.getParameter("rno");
		String name = req.getParameter("name");
		int pno =Integer.parseInt(req.getParameter("pno"));
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String Gender = req.getParameter("gender");
		String address = req.getParameter("ads");
		
		
		student student = new student();
		PrintWriter pw = resp.getWriter();
		AdminService service = new AdminService();
		
		
		student.setName(name);
		student.setPno(pno);
		student.setEmail(email);
		student.setDob(dob);
		student.setGender(Gender);
		student.setAddress(address);

	
		if(service.updateStudent(rno, student)){
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('data stored Succenfully');");
			pw.println("</script>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("admin-home.jsp");
			dispatcher.include(req, resp);
			
		}else{
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('data not stored Succenfully');");
			pw.println("</script>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("admin-home.jsp");	
			dispatcher.include(req, resp);

			
		}
		
	}

}
