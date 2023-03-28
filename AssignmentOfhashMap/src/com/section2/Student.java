package com.section2;

public class Student {

	int age;
	String name;
	int marks;

	public Student() {

	}

	public Student(int age, String name, int marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "::age=" + age + ", name=" + name + ", marks=" + marks + "Address:";
	}

}
