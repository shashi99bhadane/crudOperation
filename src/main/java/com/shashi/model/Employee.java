package com.shashi.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private String empAdress;
	private String empEmail;
	private double empSalary;
	private int empAge;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdress=" + empAdress + ", empEmail="
				+ empEmail + ", empSalary=" + empSalary + ", empAge=" + empAge + "]";
	}

}
