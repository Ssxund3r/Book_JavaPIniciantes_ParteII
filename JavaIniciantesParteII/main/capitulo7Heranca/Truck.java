package capitulo7Heranca;

//Estende Vehicle para criar a especialização Truck.
public class Truck extends Vehicle {
	private int cargocap;

	// este é um construtor para Truck.
	public Truck(int p, int f, int m, int c) {
		// Inicializa membros de Vehicle usando o construtor de Vehicle.
		super(p, f, m);
		cargocap = c;
	}

	// Métodos acessadores para cargocap.
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}
}
