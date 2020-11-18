package lab9;

public class Magazine extends Book {
	private String publish;

	public Magazine(String title, int page, String writer, String publish) {
		super(title, page, writer);
		this.publish = publish;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return super.toString() + "Magazine [publish=" + publish + "]";
	}

	
	
}
