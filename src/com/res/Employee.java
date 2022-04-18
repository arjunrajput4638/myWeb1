package com.res;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employees")
public class Employee {
	private String empNo;
	private String EmpName;
	private String position;
	public Employee() {}
	public Employee(String empNo, String empName, String position) {
		super();
		this.empNo = empNo;
		EmpName = empName;
		this.position = position;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


}
