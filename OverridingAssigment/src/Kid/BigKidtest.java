package Kid;


public class BigKidtest  extends Kid{
	
	
	@Override
	void readBook(int id, String name) {

		System.out.println("I am big kid class....");
	}
	
	@Override
	public String toString()
	{
		return "Book id=>"+this.id+"  "+"BookName=> "+this.name;
	}

	public static void main(String[] args) {

		BigKidtest bt1=new BigKidtest();
		bt1.readBook(12, "Java");
		System.out.println(bt1);
	}

}
