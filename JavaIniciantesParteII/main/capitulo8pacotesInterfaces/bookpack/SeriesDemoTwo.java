package capitulo8pacotesInterfaces.bookpack;

public class SeriesDemoTwo {
	public static void main(String[] args) {
		ByTwo twoOb = new ByTwo();
		ByThrees threeOb = new ByThrees();
		Series ob;

		for (int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Next ByTwos value is " + ob.getNext());

			ob = threeOb;
			System.out.println("Next ByThree value is " + ob.getNext());
		}
	}
}
