package com.spring.boot.all.bean;

public class StudentBean {

	private int id;

	private String fname;

	private String lname;

	
	public String getFname() {
		return fname;
	}

	public int getId() {
		return id;
	}

	public String getLname() {
		return lname;
	}

	
	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

}
