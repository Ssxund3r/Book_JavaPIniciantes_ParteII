package capitulo7Heranca;

//Uma hierarquia de calsse simples.
//Uma classe para objetos de duas dimensões. 
class TwoDShape {
	// Agora estes atributos são privados.
	private double width;
	private double height;

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
		System.out.println("Width and height are " +
	width + " and " + height);
	}

}
