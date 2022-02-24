package lab4m;

public class Writtenitem extends Item{
	private String author;

	@Override
	public String getId() {
		return super.id;
	}

	@Override
	public void setId(String id) {
		super.id=id;
		
	}

	@Override
	public String getTitle() {
		return super.title;
	}

	@Override
	public void setTitle(String title) {
		super.title=title;
	}

	@Override
	public int getCopies() {
		return super.copies;
	}

	@Override
	public void setCopies(int copies) {
		super.copies=copies;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
