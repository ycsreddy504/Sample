package com.vedait.practice.stringex;

public class Employee {
	
	int empno;
	String ename;
	String designation;
	
	public Employee(int empno, String ename, String designation) {
		this.empno = empno;
		this.ename = ename;
		this.designation = designation;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", designation=" + designation + "]";
	}




	public static void main(String[] args) {
		
		Employee employee1=new Employee(101, "Chandra", "Java Developer");
		
		Employee employee2=new Employee(102, "Yaswanth", "Java trainer");
		
		System.out.println(employee1.toString()); // compiler will write employee1.toString()
		System.out.println(employee2); // compiler will write employee2.toString()
		
		//System.out.println(employee1.hashCode()); // compiler will write employee1.toString()
		//System.out.println(employee2.hashCode()); // compiler will write employee2.toString()
		
		
	}
	
	

}
