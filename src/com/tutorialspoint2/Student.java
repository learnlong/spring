package com.tutorialspoint2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
	@Autowired(required=false)//@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	@Autowired//@Required
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
}
