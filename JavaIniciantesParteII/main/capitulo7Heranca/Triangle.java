package capitulo7Heranca;
//uma subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return width * height / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
