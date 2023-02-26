package com.videoslvingrogram;

public class Student1 {

	private int id;
	private String name;
	private int marks[];

	public Student1(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return "Student Details:"+  id+"   "+name+"  "+marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
