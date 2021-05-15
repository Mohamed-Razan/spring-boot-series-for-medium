package com.series.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.series.springboot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
