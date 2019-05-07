package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class MainModel {
	@Id
	@Column(columnDefinition = "VARCHAR(25)")
	private String empname;
	
	@Column(columnDefinition = "VARCHAR(25)")
	private String empbatch;
	@Column(columnDefinition = "VARCHAR(25)")
	private String emppass;
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpbatch() {
		return empbatch;
	}
	public void setEmpbatch(String empbatch) {
		this.empbatch = empbatch;
	}
	public String getEmppass() {
		return emppass;
	}
	public void setEmppass(String emppass) {
		this.emppass = emppass;
	}
	
	
}
