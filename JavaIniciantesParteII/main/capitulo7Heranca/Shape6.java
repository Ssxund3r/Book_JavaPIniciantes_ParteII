package capitulo7Heranca;

public class Shape6 {
	public static void main(String[] args) {
		
		ColorTriangle t1= new ColorTriangle("blue", 8.0, 12.0, "outlined");
		ColorTriangle t2= new ColorTriangle("red", 4.0, 4.0, "filled");
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());
		
	}
}
