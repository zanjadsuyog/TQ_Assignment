package com.arrays_of_object;

import java.util.Scanner;

import com.videoslvingrogram.Student;

public class StudentTest {

	public static void main(String[] args) {
		
	  Scanner sc= new Scanner(System.in);	

      Student stud[]= new Student[3];
     /* 
      float m1[]= {34f,56f,78f};
      stud[0]= new Student(1,"Shruti",m1);
      
      System.out.println(stud[0]);
      */
      float m1[] ;
      
      for(int i=0;i<3;i++)
      {
    	 stud[i]= new Student();
    	  
    	System.out.println("Enter id:");
  		stud[i].setId(sc.nextInt());
  		
  		System.out.println("Enter name:");
  		stud[i].setName(sc.next());
  		
  		m1= new float[3];
  		System.out.println("Enter marks:");
  		for(int j=0;j<m1.length;j++)
  		 {
  			System.out.println("Subject "+(j+1)+":");
  			m1[j]= sc.nextFloat();
  		 }
  		
  		stud[i].setMarks(m1);
  		
      } 
      
      for(Student s: stud)
      {
    	  System.out.println(s);
      }
      

	}

}
