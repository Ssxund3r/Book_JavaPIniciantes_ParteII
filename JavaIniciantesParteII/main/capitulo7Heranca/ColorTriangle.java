package capitulo7Heranca;
//Estende Triangle 
public class ColorTriangle extends Triangle {
	private String color;

	public ColorTriangle(String c, double w, double h, String s) {
		super(s, w, h);
		color = c;
	}
	
	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Color is " + color);
	}
}
