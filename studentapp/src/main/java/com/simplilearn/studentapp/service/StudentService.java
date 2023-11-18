package com.simplilearn.studentapp.service;

import java.util.List;

import com.simplilearn.studentapp.model.Student;


public interface StudentService {

	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public void deleteStudent(Student student);
	public Student getStudentById(Student student);
	public boolean updateStudent(Student student);
}
