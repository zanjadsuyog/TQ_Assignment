package ContainmentWithArray;

public class Book {

	private int id;
	private String bname;
	private float price;
	private Author author;

	public Book() {

	}

	public Book(int id, String bname, float price, Author author) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", author=" + author + "]";
	}

}
