package com.vedait.practice.encapsulation;

public class EmployeeEx {

	private int empId;
	private String ename;
	private String designation;

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public static void main(String[] args) {
		EmployeeEx emp1=new EmployeeEx();
		emp1.setEmpId(1001);
		System.out.println(emp1.getEmpId());
	}

}
