package com.series.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.series.springboot.model.Student;
import com.series.springboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/create_student")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("get_student/{sid}")
	public Student getStudent(@PathVariable int sid) {
		return service.getStudentById(sid);
	}
	
	@DeleteMapping("/delete_student/{uid}")
	public String deleteStudent(@PathVariable int sid) {
		return service.deleteStudentrById(sid);
	}
	
	@PutMapping("/update_student")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
}

