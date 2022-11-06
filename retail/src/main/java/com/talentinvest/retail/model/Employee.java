package com.talentinvest.retail.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	private int eID;
	private String eName;
	private String eDOB;
	private int eSalary;
	
	public Employee() {
		
	}
	public Employee(int eID, String eName, String eDOB, int eSalary) {
		super();
		this.eID= eID;
		this.eName= eName;
		this.eDOB= eDOB;
		this.eSalary= eSalary;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDOB() {
		return eDOB;
	}
	public void seteDOB(String eDOB) {
		this.eDOB = eDOB;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eName=" + eName + ", eDOB=" + eDOB + ", eSalary=" + eSalary + "]";
	}	
}
