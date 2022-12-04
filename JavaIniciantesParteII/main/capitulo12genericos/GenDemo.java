package capitulo12genericos;

//Demonstra a classe genérica 
public class GenDemo {
	public static void main(String[] args) {

		// Cria uma referência Gen para Integers
		Gen<Integer> iOb;

		/**
		 * Cria um objeto Gen<Integer> e atribui sua referência a iOb. Observe o uso do
		 * autoBoxing no encapsulamento do valor 88 dentro de um objeto Integer
		 */
		iOb = new Gen<Integer>(88);

		// Exibe o tipo de dado usado por iOb.
		iOb.showType();

		/**
		 * Obtém o valor de iOb. Observer que nenhuma coerção é necessária.
		 */
		int v = iOb.getOb();
		System.out.println("Value: " + v);

		System.out.println();

		// Cria um objeto Gen para Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");

		// Exibe o tipo de dado usado por strOb.
		strOb.showType();

		/**
		 * Obtem o valor de strO. Novamente, Obeserve que nenhuma coerção é necessária.
		 */
		String str = strOb.getOb();
		System.out.println("Value: " + str);
	}
}
