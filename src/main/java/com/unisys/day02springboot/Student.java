package com.unisys.day02springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {

	private Integer id;
	private String name;
	
	@Autowired(required = false)
	private Float cgpa;

	public Integer getId() {
		return id;
	}

//	@Required
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

//	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

}
