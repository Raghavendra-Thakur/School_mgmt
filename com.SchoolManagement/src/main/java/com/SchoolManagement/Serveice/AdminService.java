package com.SchoolManagement.Serveice;

import java.util.List;

import com.SchoolManagement.DAO.AdminDao;
import com.SchoolManagement.DTO.Admin;
import com.SchoolManagement.DTO.student;


public class AdminService {
	
	AdminDao admindao = new AdminDao();
	
	public boolean adminlogin(Admin admin) {
		return admindao.adminlogin(admin);
	}
	
	public boolean insertStudent(student student) {
		  return admindao.insertStudent(student);
	}
	
	public boolean updateStudent(String rno ,student student) {
		return admindao.updateStudent(rno, student);
	}
	
	public boolean deleteStudent(String rno) {
		return admindao.deleteStudent(rno);
	}
	public List<student> displayStudent() throws ClassNotFoundException{
		return admindao.displayStudent();
		
	}

}
