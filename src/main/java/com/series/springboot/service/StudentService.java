package com.series.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.series.springboot.model.Student;
import com.series.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public Student getStudentById(int sid) {
		return repository.findById(sid).orElse(null);
	}
	
	public String deleteStudentrById(int sid) {
		repository.deleteById(sid);
		return "deleted";
	}
	
	public Student updateStudent(Student student) {
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		
		existingStudent.setContactNo(student.getContactNo());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setName(student.getName());
		
		repository.save(existingStudent);
		
		return existingStudent;
	}
}

