package decorator;

public class SimpleBook implements Book{
	private String title;
	
	public SimpleBook(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}

	public String getDescription() {
		return "Book";
	}
}
