package capitulo11EnumeracoesAutoboxingImpEstAnotacoes;

public class EnumDemo3 {
	public static void main(String[] args) {

		// exibe a velocidade de um avião
		System.out.println("Typical seed for an airplane is " +
			Transport2.AIRPLANE.getSpeed() + " miles per hour.\n");

		// Exibe todos os meio de transporte e velocidade
		System.out.println("All Transport speeds:");
		for (Transport2 t : Transport2.values())
			System.out.println(t + " Typical speed is " + t.getSpeed() + " miles per hour.");

	}
}
