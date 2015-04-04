package decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		SimpleBook bobBook = new SimpleBook("A Story About Bob");
		System.out.println(bobBook.getTitle());
		System.out.println(bobBook.getDescription());
		
		System.out.println();
		
		//Turn "A Story About Bob" into Children's book
		ChildrensBook kidsBobBook = new ChildrensBook(bobBook);
		System.out.println(kidsBobBook.getTitle());
		System.out.println(kidsBobBook.getDescription());
		System.out.println("Popup:" + kidsBobBook.isPopup());
		kidsBobBook.setPopup(true);
		System.out.println("Popup:" + kidsBobBook.isPopup());
		
	}
}
