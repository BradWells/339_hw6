package composite;

public class CompositeDemo {
	public static void main(String[] args) {
		SimpleBook fellow = new SimpleBook("The Fellowship of the Ring");
		SimpleBook towers = new SimpleBook("The Two Towers");
		SimpleBook king = new SimpleBook("The Return of the King");
		
		SimpleBook hobbit = new SimpleBook("The Hobbit");
		
		CompositeBook lotr = new CompositeBook("The Lord of the Rings");
		lotr.add(fellow);
		lotr.add(towers);
		lotr.add(king);
		
		CompositeBook tolkien = new CompositeBook("JRR Tolkien Set");
		tolkien.add(lotr);
		tolkien.add(hobbit);
		
		System.out.println(tolkien.getTitle());
	}
}
