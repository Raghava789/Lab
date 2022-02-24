package lab4m;

public abstract class Item {
	String id;
	String title;
	int copies;
	public abstract String getId();
	public abstract void setId(String id);
	public abstract String getTitle();
	public abstract void setTitle(String title);
	public abstract int getCopies();
	public abstract void setCopies(int copies);
	
	
}
