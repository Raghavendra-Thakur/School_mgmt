package com.SchoolManagement.DTO;

public class student {

	private String rno;
	private String name;
	private int pno;
	private String email;
	private String dob;
	private String gender;
	private String address;

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String rno, String name, int pno, String email, String dob, String gender, String address) {
		super();
		this.rno = rno;
		this.name = name;
		this.pno = pno;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	
	

	public student(String name, int pno, String email, String dob, String gender, String address) {
		super();
		this.name = name;
		this.pno = pno;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
