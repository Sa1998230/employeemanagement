package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // Marks this class as a JPA entity (maps to a DB table)
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(name="Eid")
	private int Eid;
	
	@Column(name="Ename")
	private String Ename;
	
	@Column(name="Salary")
	private double Salary;
	
	@Column(name="Address")
	private String Address;
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int Eid) {
		this.Eid = Eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String Ename) {
		this.Ename = Ename;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
}