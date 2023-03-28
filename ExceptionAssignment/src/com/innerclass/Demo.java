package com.innerclass;

import com.innerclass.Bank.Locker;

class Bank{
	 static String  location="pune";
	static String bname="SBI";
     static int regno=7264;
    
    
    public static void DisplayBankdetails()
    {
    	System.out.println(bname +"  "+location+"  "+regno);
    }
    
    class Locker
    {
    	int cid;
    	String cname;
    	public void enterdetails(int id,String name)
    	{
    		cid=id;
    		cname=name;
    	}
    }
   
    
}
public class Demo {

	public static void main(String[] args) {

		 Bank b1=new Bank();
		  b1.DisplayBankdetails();
		  
		  Bank.Locker locker1=b1.new Locker();
		  locker1.enterdetails(1,"suyog");
		  
		  System.out.println("+++++++++++++++++++++");
		  
		  Bank.Locker locker2=b1.new Bank().new Locker();
		  locker2.enterdetails(2,"Vivek");
		    
		    
	}

}
