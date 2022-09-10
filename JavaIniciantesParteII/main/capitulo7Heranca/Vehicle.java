package capitulo7Heranca;

//Constrói uma sibclasse de Vehicle para caminhões.
public class Vehicle {
	private int passengers; // número de passegeiros
	private int fuelcap; // capacidade de armazenamento de combustível em galões.
	private int mpg; // consumo de combustível em milhas por galão.

	// Este é o construtor para Vehicle
	public Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Retorna a autonomia
	int range() {
		return mpg * fuelcap;
	}

	// calcula o combustível necessário para uma dada distância.
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
	
	//Métodos de acesso de variáveis de instância
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
}
