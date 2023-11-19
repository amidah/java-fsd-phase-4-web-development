package com.simplilearn.studentapp.service;

import java.util.List;

import com.simplilearn.studentapp.model.Student;


public interface StudentService {

	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public void deleteStudent(int student_id);
	public Student getStudentById(int student_id);
	public boolean updateStudent(Student student);
}
