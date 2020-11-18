package lab9;

public class Book {
	private String title;
	private int page;
	private String writer;
	public Book(String title, int page, String writer) {
		super();
		this.title = title;
		this.page = page;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", page=" + page + ", writer=" + writer + "]";
	}
	
}
