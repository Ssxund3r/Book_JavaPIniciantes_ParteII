package capitulo7Heranca;

//uma subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {
	String style;

	public Triangle(String s, double w, double h) {
		super(w, h); //Chama o construtor da superclasse
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
