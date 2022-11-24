package com.SchoolManagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import com.SchoolManagement.DTO.Admin;
import com.SchoolManagement.DTO.student;

public class AdminDao {
	private String url = "jdbc:mysql://localhost:3306/school";
	private String user = "root";
	private String password = "root";
	Connection connection;

	public boolean adminlogin(Admin admin) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			String select = "select * from admin where name = ? and pass = ?";
			PreparedStatement statement = connection.prepareStatement(select);
			statement.setString(1, admin.getName());
			statement.setString(2, admin.getPassword());
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertStudent(student student) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			String insert = "INSERT INTO student (`rno`, `name`, `phoneno`, `emailid`, `dob`, `gender`, `address`) VALUES (?,?,?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(insert);

			preparedStatement.setString(1, student.getRno());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getPno());
			preparedStatement.setString(4, student.getEmail());
			preparedStatement.setString(5, student.getDob());
			preparedStatement.setString(6, student.getGender());
			preparedStatement.setString(7, student.getAddress());

			int a = preparedStatement.executeUpdate();
			if (a > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateStudent(String rno, student student) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			String update = "UPDATE student SET name = ?, phoneno = ?, emailid = ?, dob = ?, gender = ?, address = ? WHERE rno = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(update);

			preparedStatement.setString(1, student.getName());
			preparedStatement.setInt(2, student.getPno());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setString(4, student.getDob());
			preparedStatement.setString(5, student.getGender());
			preparedStatement.setString(6, student.getAddress());
			preparedStatement.setString(7, rno);

			int a = preparedStatement.executeUpdate();
			if (a > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public boolean deleteStudent(String rno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			String delete = "DELETE FROM student WHERE rno = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setString(1, rno);
			int a = preparedStatement.executeUpdate();
			if (a > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;

	}

	public List<student> displayStudent() throws ClassNotFoundException {
		List<student> students = new ArrayList<>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			String delete = "select * from student";

			PreparedStatement preparedStatement = connection.prepareStatement(delete);
			ResultSet resultSet = preparedStatement.executeQuery();
			//rno, name, phoneno, emailid, dob, gender, address
			while (resultSet.next()) {
				String rno = resultSet.getString("rno");
				String name = resultSet.getString("name");
				int pno = resultSet.getInt("phoneno");
				String email = resultSet.getString("emailid");
				String dob = resultSet.getString("dob");
				String gender = resultSet.getString("gender");
				String add = resultSet.getString("address");
				students.add(new student(rno, name, pno, email, dob, gender, add));
			}
			System.out.println(students.get(1).getRno());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
