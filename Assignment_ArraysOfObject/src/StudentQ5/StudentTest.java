package StudentQ5;

import java.util.Arrays;

public class StudentTest {

	public static void display(Student []std)
	{
     //   System.out.println("Students with marks > 60 and age < 15:");

        for(Student student:std)
        {
       // 	if (student.marks > 60 && student.marks < 15)
               {
            	   System.out.println("Student rollnumber: "+student.rno);
            	   System.out.println("Student name: "+student.name);
            	   System.out.println("Student age: "+student.age);
            	   System.out.println("Student marks:  "+student.marks);
            	   
            	   System.out.println();
               }
        }
	}
	
	public static void main(String[] args) {

		Student[] std= {
				new Student(1,"Omkar", 20, 45),
				new Student(2,"Suyog", 25, 10),
				new Student(3,"Gaurav", 40, 54),
				new Student(4,"Vivek", 24, 100),
				
		};
		
		
	   System.out.println(Arrays.toString(std));
		StudentTest.display(std);
		
		
		
	}

}
