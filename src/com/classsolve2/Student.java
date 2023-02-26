package com.classsolve2;

import java.util.Arrays;

public class Student {
	
	private  int id;
	private String name;
	private Subject subject[];
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Subject[] subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + Arrays.toString(subject) + "]";
	}
	
	
	
	
} 
