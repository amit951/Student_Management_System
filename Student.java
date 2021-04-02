package com.student.manage;

public class Student {
	int id;
	String sname;
	String sphone;
	String city;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String sname, String sphone, String city) {
		super();
		this.id = id;
		this.sname = sname;
		this.sphone = sphone;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String sphone, String city) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", sphone=" + sphone + ", city=" + city + "]";
	}
	

}
