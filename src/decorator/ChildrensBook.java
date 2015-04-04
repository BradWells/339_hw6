package decorator;

public class ChildrensBook extends BookDecorator{
	private boolean popup;

	public ChildrensBook(Book book) {
		this.book = book;
		popup = false;
	}
	
	public String getTitle(){
		return book.getTitle() + " and the Crazy Elves!";
	}

	public String getDescription() {
		return "Children's " + book.getDescription();
	}
	
	public boolean isPopup(){
		return popup;
	}
	
	public void setPopup(boolean popup){
		this.popup = popup;
	}
}
