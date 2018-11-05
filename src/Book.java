
public class Book {
	public Book(String title, String author, String status, String dueDate) {
		super();
		this.title = title;
		this.author = author;
		this.status = status;
		this.dueDate = dueDate;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	private String title;
	private String author;
	private String status;
	private String dueDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return String.format("%-28s %-20s %-21s %-1s", title, author, status, dueDate); 
	}

}