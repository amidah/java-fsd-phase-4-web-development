package com.simplilearn.studentapp.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.simplilearn.studentapp.model.Student;
import com.simplilearn.studentapp.repository.StudentRepository;
import com.simplilearn.studentapp.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student student) {
		boolean status = false;
		Student s = studentRepository.save(student);
		if (!ObjectUtils.isEmpty(s)) {
			status = true;
		}
		return status;
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudent(Student student) {

		studentRepository.delete(student);
	}

	@Override
	public Student getStudentById(Student student) {

		return studentRepository.getById(student.getStudent_id());
	}

	@Override
	public boolean updateStudent(Student student) {

		boolean status = false;
		Student s = studentRepository.save(student);
		if (!ObjectUtils.isEmpty(s)) {
			status = true;
		}
		return status;
	}

}
