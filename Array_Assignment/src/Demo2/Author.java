package Demo2;

public class Author {

	private int id;
	private String Aname;
	
	public Author()
	{
		
	}
	
	public Author(int id,String aname)
	{
		this.id=id;
		this.Aname=aname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String  getName() {
		return Aname;
	}

	public void setName(String  aname) {
		this.Aname = aname;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", aname=" + Aname + "]";
	}
	
	
	
}
