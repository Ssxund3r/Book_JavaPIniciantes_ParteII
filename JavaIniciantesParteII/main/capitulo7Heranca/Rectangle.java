package capitulo7Heranca;

//Uma subclasse de TwoDShape para retângulos
public class Rectangle extends TwoDShape {

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		else
			return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
	
}
