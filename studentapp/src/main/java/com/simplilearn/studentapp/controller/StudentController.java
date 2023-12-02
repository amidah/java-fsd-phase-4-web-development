package com.simplilearn.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.studentapp.model.Student;
import com.simplilearn.studentapp.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/student/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("save-student")
	public boolean saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("get-students")
	public List<Student> getAllStudents(){
		return studentService.getStudents();
	}
	
	@DeleteMapping("delete-student/{student_id}")
	public boolean deleteStudent(@PathVariable("student_id") int student_id) {
		return studentService.deleteStudent(student_id);
	}
	
	@GetMapping("get-student-by-id/{student_id}")
	public Student getStudentById(@PathVariable("student_id") int student_id) {
		return studentService.getStudentById(student_id);
	}
	
	@PutMapping("update-student")
	public boolean updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
}
