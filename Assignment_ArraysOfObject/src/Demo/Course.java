package Demo;

public class Course {

   private int id;
   private String  name;
   
   public Course()
   {
	   
   }
   
   public Course(int id,String name)
   {
	   this.id=id;
	   this.name=name;
	   
   }
   
   public void setId(int id)
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
   
   
   @Override
public String toString()
   {
	   return "course:  "+  id+ " " +name;
   }
}
