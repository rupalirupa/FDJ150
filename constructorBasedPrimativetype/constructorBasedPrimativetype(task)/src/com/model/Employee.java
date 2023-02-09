package com.model;

public class Employee
{
private int eid;
private String ename;
private double esalary;
private long emobileno;
private char gender;
private String emailid;
public Employee(int eid, String ename, double esalary, long emobileno, char gender, String emailid) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
	this.emobileno = emobileno;
	this.gender = gender;
	this.emailid = emailid;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", emobileno=" + emobileno
			+ ", gender=" + gender + ", emailid=" + emailid + "]";
}

}