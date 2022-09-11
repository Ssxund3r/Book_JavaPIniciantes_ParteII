package capitulo7Heranca;

//Uma hierarquia de calsse simples.
//Uma classe para objetos de duas dimensões.
//Adiciona construtores a TwoDShape
class TwoDShape {
	// Agora estes atributos são privados.
	private double width;
	private double height;
	private String name;

	// Construtor padrão.
	TwoDShape() {
		width = height = 0;
		name = "none";
	}

	// Construtor parametrizado
	public TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Constrói o objeto com altura e largura iguais.
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	//Constrói um objeto a partir de outro
	TwoDShape (TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	String getName() {
		return name;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	double area() {
		System.out.println("area() must be overridden");
		return 0.0;
	}

}
