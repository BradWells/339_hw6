package composite;

/**
 * This is the Leaf of the Composite Pattern
 */
public class SimpleBook implements Book{
	private String title;
	
	public SimpleBook(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
}
