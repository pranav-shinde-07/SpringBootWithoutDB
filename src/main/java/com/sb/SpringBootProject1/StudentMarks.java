package com.sb.SpringBootProject1;

public class StudentMarks {
	
	private double studentTenthMarks;
	private double studentTwelvethMarks;
	private double studentBachelorDegreeMarks;
	private double studentMasterDegreeMarks;
	
	public StudentMarks(double studentTenthMarks, double studentTwelvethMarks, double studentBachelorDegreeMarks,
			double studentMasterDegreeMarks) {
		super();
		this.studentTenthMarks = studentTenthMarks;
		this.studentTwelvethMarks = studentTwelvethMarks;
		this.studentBachelorDegreeMarks = studentBachelorDegreeMarks;
		this.studentMasterDegreeMarks = studentMasterDegreeMarks;
	}
	
	public double getStudentTenthMarks() {
		return studentTenthMarks;
	}
	public void setStudentTenthMarks(double studentTenthMarks) {
		this.studentTenthMarks = studentTenthMarks;
	}
	public double getStudentTwelvethMarks() {
		return studentTwelvethMarks;
	}
	public void setStudentTwelvethMarks(double studentTwelvethMarks) {
		this.studentTwelvethMarks = studentTwelvethMarks;
	}
	public double getStudentBachelorDegreeMarks() {
		return studentBachelorDegreeMarks;
	}
	public void setStudentBachelorDegreeMarks(double studentBachelorDegreeMarks) {
		this.studentBachelorDegreeMarks = studentBachelorDegreeMarks;
	}
	public double getStudentMasterDegreeMarks() {
		return studentMasterDegreeMarks;
	}
	public void setStudentMasterDegreeMarks(double studentMasterDegreeMarks) {
		this.studentMasterDegreeMarks = studentMasterDegreeMarks;
	}

	@Override
	public String toString() {
		return "StudentMarks [studentTenthMarks=" + studentTenthMarks + ", studentTwelvethMarks=" + studentTwelvethMarks
				+ ", studentBachelorDegreeMarks=" + studentBachelorDegreeMarks + ", studentMasterDegreeMarks="
				+ studentMasterDegreeMarks + "]";
	}
	
}
