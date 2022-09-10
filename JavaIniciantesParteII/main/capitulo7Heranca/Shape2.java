package capitulo7Heranca;

public class Shape2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);

		System.out.println("Into for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is : " + t1.area());

		System.out.println();

		System.out.println("Into for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is : " + t2.area());

	}
}
