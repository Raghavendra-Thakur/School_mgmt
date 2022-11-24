package com.SchoolManagement.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolManagement.DTO.student;
import com.SchoolManagement.Serveice.AdminService;
@WebServlet(value="/display")
public class StudentDisplayServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminService admin = new AdminService();
		
		try {
			List<student> students = admin.displayStudent();
			
			req.setAttribute("students", students);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("admin-home.jsp");
			dispatcher.forward(req, resp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
