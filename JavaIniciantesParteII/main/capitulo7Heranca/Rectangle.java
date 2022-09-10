package capitulo7Heranca;

//Uma subclasse de TwoDShape para retângulos
public class Rectangle extends TwoDShape {

	boolean isSquare() {
		if (width == height)
			return true;
		else
			return false;
	}

	double area() {
		return width * height;
	}
	
}
