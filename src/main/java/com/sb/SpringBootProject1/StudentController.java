package com.sb.SpringBootProject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
//	StudentService service = new StudentService();
	
	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/get-all-students")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete-student/{studentId}")
	public String deleteStudent(@PathVariable("studentId") long studentId) {
		return service.deleteStudent(studentId);
	}
	
	@GetMapping("/get-student-by-id/{studentId}")
	public Student getStudentById(@PathVariable("studentId") long studentId) {
		return service.getStudentById(studentId);
	}
		
	@GetMapping("/get-student-with-max-course-fees")
	public Student getStudentsWithMaxCourseFees() {
		return service.getStudentWithMaxCourseFees();
	}
	
	@GetMapping("/get-student-with-min-course-fees")
	public Student getStudentWithMinCourseFees() {
		return service.getStudentWithMinCourseFees();
	}

}
