package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Composite of the Composite Pattern
 */
public class CompositeBook implements Book{
	private List<Book> includedBooks;
	private String compositeTitle;
	
	public CompositeBook(String title){
		compositeTitle = title;
		includedBooks = new ArrayList<Book>();
	}

    public void add(Book book) {
        includedBooks.add(book);
    }
 
    public void remove(Book book) {
        includedBooks.remove(book);
    }
    
    public String getTitle(){
    	String wholeTitle = compositeTitle + " which contains:\n(\n";
    	for(Book book : includedBooks){
    		wholeTitle += book.getTitle() + "\n";
    	}
    	wholeTitle += ")";
    	return wholeTitle;
    }
}
