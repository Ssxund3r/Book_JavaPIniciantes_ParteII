package capitulo11EnumeracoesAutoboxingImpEstAnotacoes;

public class EnumDemo {
	public static void main(String[] args) {
		Transport tp;

		tp = Transport.AIRPLANE;

		// exibe um valor de enum.
		System.out.println("Value of tp: " + tp);
		System.out.println();

		tp = Transport.TRAIN;

		// compara dois valores da enum.
		if (tp == Transport.TRAIN)
			System.out.println("tp constains TRAIN.\n");

		// Usa uma enum para controlar uma intrução switch
		switch (tp) {
		case CAR:
			System.out.println("A car carries people!");
			break;
		case TRUCK:
			System.out.println("A truck carries freight! ");
			break;
		case AIRPLANE:
			System.out.println("An airplane flies.");
			break;
		case TRAIN:
			System.out.println("A train runs in rails.");
			break;
		case BOAT:
			System.out.println("A boat sails on water.");
			break;
		}
	}
}
