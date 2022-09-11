package capitulo7Heranca;

public class TruckDemo {
	public static void main(String[] args) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelNeeded(dist);

		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

		gallons = pickup.fuelNeeded(dist);

		System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles pickup needs " + " miels pickup needs " + 
		gallons + " gallons of fuel.");

	}
}
