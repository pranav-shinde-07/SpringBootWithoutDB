package com.sb.SpringBootProject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	List<Student> list = new ArrayList<>();

	public String addStudent(Student student) {

//		list of first 3 student added hard-coded
//		1
		StudentAddress a1 = new StudentAddress("Nasik", "Maharashtra", "414005");
		StudentMarks m1 = new StudentMarks(65d, 55d, 75d, 63d);
		Student s1 = new Student(1l, "Ashish", 22, a1, "0987654321", "ash@gmail.com", "MCA", m1, "Python Development",
				35000d);
//		2
		StudentAddress a2 = new StudentAddress("Pune", "Maharashtra", "411028");
		StudentMarks m2 = new StudentMarks(90d, 69d, 82d, 0d);
		Student s2 = new Student(2l, "Rahul", 24, a2, "1234567890", "rah@gmail.com", "BCA", m2, "Fullstak Development",
				55000d);
//		3
		StudentAddress a3 = new StudentAddress("Bengaluru", "Karnataka", "423001");
		StudentMarks m3 = new StudentMarks(75d, 65d, 80d, 0d);
		Student s3 = new Student(3l, "Sagar", 25, a3, "0912345678", "Sa@gmail.com", "BE Computers", m3,
				"Java Development", 45000d);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(student);
		return "Student Added!";
	}

	public List<Student> getAllStudents() {
		List<Student> newList = null;
		newList = list;
		return newList;
	}

	public String updateStudent(Student student) {
		for (Student s : list) {
			if (student.getStudentId() == s.getStudentId()) {
				s.setStudentId(student.getStudentId());
				s.setStudentName(student.getStudentName());
				s.setStudentAge(student.getStudentAge());
				s.setStudentAddress(student.getStudentAddress());
				s.setStudentPhone(student.getStudentPhone());
				s.setStudentEmail(student.getStudentEmail());
				s.setStudentHigherEducation(student.getStudentHigherEducation());
				s.setStudentMarks(student.getStudentMarks());
				s.setStudentCourse(student.getStudentCourse());
				s.setStudentCourseFees(student.getStudentCourseFees());
			}
		}
		return "Student Updated!";
	}

	public String deleteStudent(long studentId) {
		for (Student s : list) {
			if (studentId == s.getStudentId()) {
				list.remove(s);
				return "Student Deleted!";
			}
		}
		return "Student not found";
	}

	public Student getStudentById(long studentId) {
		Student student = null;
		for (Student s : list) {
			if (studentId == s.getStudentId()) {
				student = s;
			}
		}
		return student;
	}

}
