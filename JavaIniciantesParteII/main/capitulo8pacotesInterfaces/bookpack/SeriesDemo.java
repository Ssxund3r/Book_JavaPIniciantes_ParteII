package capitulo8pacotesInterfaces.bookpack;

public class SeriesDemo {
	public static void main(String[] args) {
		ByTwosPrev ob = new ByTwosPrev();
		
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		System.out.println("\nResetting...");
		ob.reset();
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		System.out.println("\nResetting...");
		ob.setStart(100);
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		
	}
}
