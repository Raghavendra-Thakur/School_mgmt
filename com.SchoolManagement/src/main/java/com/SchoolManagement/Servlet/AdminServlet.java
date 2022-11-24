package com.SchoolManagement.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SchoolManagement.DTO.Admin;
import com.SchoolManagement.Serveice.AdminService;

@WebServlet(value = "/login")
public class AdminServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		AdminService admins = new AdminService();
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
		HttpSession httpsession = req.getSession();
		PrintWriter pw = resp.getWriter();
		
		try {
			if(admins.adminlogin(admin)){
				httpsession.setAttribute("AdminName", admin);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("admin-home.jsp");
				requestDispatcher.forward(req, resp);
				
			}else {
					pw.append("<h1>Login Credential Is Wrong<h1>");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("admin-login.jsp");
					requestDispatcher.include(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
