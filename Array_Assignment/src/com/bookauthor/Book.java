package com.bookauthor;

public class Book {

	
	private int id;
	private String name;
	private float price;
	private Author a;
	
	public Book(){
		
	}
	
	public Book(int id,String name,float price,Author a)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.a=a;
	}
	public void setId(Author a)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}

	public float getPrice()
	{
		return price;
	}
	
	public Author getA() {
		return a;
	}

	public void setA(Author a) {
		this.a = a;
	}

	@Override
	public String toString()
	{
		return "Book id: "+id +" BookName: "+name+" BookPrice : "+price+" "+ a;
	}
	
	
	
}
