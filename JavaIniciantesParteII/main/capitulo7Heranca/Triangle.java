package capitulo7Heranca;

//uma subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {
	private String style;
	
	//Construtor padrão
	public Triangle() {
		super();
		style = "none";
	}
	
	//Construtor
	public Triangle(String s, double w, double h) {
		super(w, h, "Triangle"); //Chama o construtor da superclasse
		style = s;
	}
	
	//construtor com argumento 
	Triangle(double x){
		super(x, "Triangle");
		style = "filled";
	}
	
	//Constrói um objeto a partir de outro
	Triangle(Triangle ob){
		super(ob); //Passa o objeto para construtor de TwoDShape
		style = ob.style;
	}
	
	//Sobrepõe area() para Triangle.
	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
