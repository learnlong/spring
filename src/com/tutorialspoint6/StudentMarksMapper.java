package com.tutorialspoint6;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setYear(rs.getInt("sid"));
		return studentMarks;
	}
	
}
