package com.tutorialspoint4;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{

	private DataSource dataSource;
	private JdbcTemplate jdbctTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.jdbctTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into Student (name,age) values (?,?)";
		jdbctTemplateObject.update(sql,name,age);
		System.out.println("Created Record Name =" + name +"Age" +age);
		return;
		
	}

	@Override
	public Student getStudent(Integer id) {
		String sql = "select * from Student where id = ?";
		Student student = jdbctTemplateObject.queryForObject(sql, new Object[]{id},new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from Student";
		List<Student> students  = jdbctTemplateObject.query(sql, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from Student where id = ?";
		jdbctTemplateObject.update(sql,id);
		System.out.println("Delete Record with ID =" + id);
		return;
		
	}

	@Override
	public void update(Integer id, Integer age) {
		String sql = "update Student set age = ? where id = ?";
		jdbctTemplateObject.update(sql,age,id);
		System.out.println("update Record with Id = "+id);
		return;
		
	}

}
