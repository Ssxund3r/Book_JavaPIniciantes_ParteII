package capitulo7Heranca;
//uma subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
