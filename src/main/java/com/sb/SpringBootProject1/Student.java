package com.sb.SpringBootProject1;

public class Student {
	
	private long studentId;
	private String studentName;
	private int studentAge;
	private StudentAddress studentAddress;
	private String studentPhone;
	private String studentEmail;
	private String studentHigherEducation;
	private StudentMarks studentMarks;
	private String studentCourse;
	private double studentCourseFees;
	
	public Student() {
		
	}
	
	public Student(long studentId, String studentName, int studentAge, StudentAddress studentAddress,
			String studentPhone, String studentEmail, String studentHigherEducation,
			StudentMarks studentMarks, String studentCourse, double studentCourseFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.studentHigherEducation = studentHigherEducation;
		this.studentMarks = studentMarks;
		this.studentCourse = studentCourse;
		this.studentCourseFees = studentCourseFees;
	}
	
	public long getStudentId() {
		return studentId;
	}
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentPhone() {
		return studentPhone;
	}
	
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {	
		this.studentEmail = studentEmail;
	}
	
	public String getStudentHigherEducation() {
		return studentHigherEducation;
	}
	
	public void setStudentHigherEducation(String studentHigherEducation) {
		this.studentHigherEducation = studentHigherEducation;
	}
	
	public StudentMarks getStudentMarks() {
		return studentMarks;
	}
	
	public void setStudentMarks(StudentMarks studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	public String getStudentCourse() {
		return studentCourse;
	}
	
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	public double getStudentCourseFees() {
		return studentCourseFees;
	}
	
	public void setStudentCourseFees(double studentCourseFees) {
		this.studentCourseFees = studentCourseFees;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentAddress=" + studentAddress + ", studentPhone=" + studentPhone + ", studentEmail="
				+ studentEmail + ", studentHigherEducation=" + studentHigherEducation + ", studentMarks=" + studentMarks
				+ ", studentCourse=" + studentCourse + ", studentCourseFees=" + studentCourseFees + "]";
	}
	
}
