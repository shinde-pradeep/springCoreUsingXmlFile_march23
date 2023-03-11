package com.coreSpringXml.SetterBasedDi;

public class Student {

	
	private String sName;
	
	private String sSurname;
	
	private int sId;

//-----------------------------------------------------------------	
	
	public Student() {
		super();
		System.out.println("in side student class no-arg constructor");
	}

	
//-----------------------------------------------------------------	
	
	public Student(String sName, String sSurname, int sId) {
		super();
		this.sName = sName;
		this.sSurname = sSurname;
		this.sId = sId;
		System.out.println("in side student class arg constructor");

	}
	
//-----------------------------------------------------------------	
	

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sSurname=" + sSurname + ", sId=" + sId + "]";
	}

//-----------------------------------------------------------------	
	
	
	public String getsName() {
		System.out.println("in side student class getsName method");
		return sName;
		
	}

	public void setsName(String sName) {
		this.sName = sName;

		System.out.println("in side student class setsName method");
	}

	public String getsSurname() {
		return sSurname;
	}

	public void setsSurname(String sSurname) {
		this.sSurname = sSurname;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
	
	
}
