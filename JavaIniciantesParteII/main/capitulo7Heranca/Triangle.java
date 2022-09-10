package capitulo7Heranca;

//uma subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {
	String style;

	public Triangle(String s, double h, double w) {
		setWidth(w);
		setHeight(h);
		style = s;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
