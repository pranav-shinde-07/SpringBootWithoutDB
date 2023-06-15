package com.sb.SpringBootProject1;

public class StudentAddress {
	
	private String studentCity;
	private String studentState;
	private String studentPin;
	
	public StudentAddress(String studentCity, String studentState, String studentPin) {
		super();
		this.studentCity = studentCity;
		this.studentState = studentState;
		this.studentPin = studentPin;
	}
	
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentPin() {
		return studentPin;
	}
	public void setStudentPin(String studentPin) {
		this.studentPin = studentPin;
	}

	@Override
	public String toString() {
		return "StudentAddress [studentCity=" + studentCity + ", studentState=" + studentState + ", studentPin="
				+ studentPin + "]";
	}
	
}
