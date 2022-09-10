package capitulo7Heranca;

//Uma hierarquia de calsse simples.
//Uma classe para objetos de duas dimensões.
//Adiciona construtores a TwoDShape
class TwoDShape {
	// Agora estes atributos são privados.
	private double width;
	private double height;

	// Construtor padrão.
	TwoDShape() {
		width = height = 0;
	}

	// Construtor parametrizado
	public TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Constrói o objeto com altura e largura iguais.
	TwoDShape(double x) {
		width = height = x;
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

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}
