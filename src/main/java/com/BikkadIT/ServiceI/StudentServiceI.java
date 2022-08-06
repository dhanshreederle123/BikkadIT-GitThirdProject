package com.BikkadIT.ServiceI;

import java.util.List;

import com.BikkadIT.model.Student;

public interface StudentServiceI {
public int addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer id);
	


}
