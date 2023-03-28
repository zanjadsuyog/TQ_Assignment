package com.bookauthor;

public class Author {

	private int id;
	private String name;
	
	public Author()
	{
		
	}
	
	public  Author(int id,String name)
	
	{
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
		
	}
	public String  getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return "Author id : "+ id +" Author name:"+name;
	}
}
