package com.unisys.day02springboot;

import org.springframework.stereotype.Component;

@Component(value = "UniversityStudent")
public class GradStudent {

	private int id;
	private String name;
	private float cgpa;

	public GradStudent() {

	}

	public GradStudent(int id, String name, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "GradStudent [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

}
