package com.vedait.practice.encapsulation;

public class StudentEx {
	
	private int sno;
	private String sname;
	private String cource;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentEx [sno=" + sno + ", sname=" + sname + ", cource=" + cource + "]";
	}
	public static void main(String[] args) {
		StudentEx s1=new StudentEx();
		s1.setSno(1001);
		s1.setSname("Sirisha");
		s1.setCource("Core Java");
		
		StudentEx s2=new StudentEx();
		s2.setSno(1002);
		s2.setSname("Poojith");
		s2.setCource("Core Advc");
		
		System.out.println("Studetn Id: "+ s1.getSno());

		System.out.println("Studetn Name: "+ s1.getSname());

		System.out.println("Studetn Cource: "+ s1.getCource());
		System.out.println();
		System.out.println("Studetn Id: "+ s2.getSno());

		System.out.println("Studetn Name: "+ s2.getSname());

		System.out.println("Studetn Cource: "+ s2.getCource());
		
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
