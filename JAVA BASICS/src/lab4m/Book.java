package lab4m;

public class Book extends Writtenitem{
	
	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		super.setTitle(title);
	}

}
