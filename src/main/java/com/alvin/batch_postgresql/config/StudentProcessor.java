package com.alvin.batch_postgresql.config;

import org.springframework.batch.item.ItemProcessor;

import com.alvin.batch_postgresql.student.Student;

public class StudentProcessor implements ItemProcessor<Student, Student> {
	
	@Override
	public Student process (Student student) throws Exception {
		// all the business logic goes here
		// ok
		// feature branch 0921202401
		// feature branch conflict 0921202401
		student.setId(null);
		return student;
	}

}
