package capitulo7Heranca;

//Uma subclasse de TwoDShape para retângulos
public class Rectangle extends TwoDShape {

	// Construtor padrão
	public Rectangle() {
		super();
	}

	public Rectangle(double w, double h) {
		super(w, h, "Rectangle"); // chama o construtor da superclasse
	}

	// Contrói um quadrado
	Rectangle(double x) {
		super(x, "Rectangle"); // chama construtor superclasse
	}

	// Constrói um objeto a partir de outro
	Rectangle(Rectangle ob) {
		super(ob); // passa o objeto para construtor de TwoDShape
	}

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
