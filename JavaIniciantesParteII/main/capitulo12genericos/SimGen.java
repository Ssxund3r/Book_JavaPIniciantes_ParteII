package capitulo12genericos;

public class SimGen {
	public static void main(String[] args) {

		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

		// Exibe os tipos
		tgObj.showType();

		// Obtém e exibe valores
		int v = tgObj.getOb1();

		System.out.println("Value: " + v);

		String str = tgObj.getOb2();
		System.out.println("Value: " + str);

	}
}
