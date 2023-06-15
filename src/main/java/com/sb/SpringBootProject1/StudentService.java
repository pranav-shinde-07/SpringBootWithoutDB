package com.sb.SpringBootProject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
//	StudentDao dao = new StudentDao();
	
	public String addStudent(Student student) {
		return dao.addStudent(student);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	public String updateStudent(Student student) {
		return dao.updateStudent(student);
	}

	public String deleteStudent(long studentId) {
		return dao.deleteStudent(studentId);
	}

	public Student getStudentById(long studentId) {
		return dao.getStudentById(studentId);
	}
	
	public Student getStudentWithMaxCourseFees() {
		List<Student> list = dao.getAllStudents();
		Student student = null;
		double maxCourseFees = 0d;
		for(Student s:list) {
			if(maxCourseFees < s.getStudentCourseFees()) {
				maxCourseFees = s.getStudentCourseFees();
				student = s;
			}
		}
		return student;
	}

}
