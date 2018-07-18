package com.tutorialspoint5;

import java.util.List;

import javax.sql.DataSource;

import com.tutorialspoint5.Student;

public interface StudentDAO {
	public void setDataSource(DataSource ds);
	
	public void create(String name,Integer age);
	
	public Student getStudent(Integer id);
	
	public List<Student> listStudents();
}
