package capitulo14expressoeslambdareferenciasmetodos;

public class LambdaDemo {
	public static void main(String[] args) {
		MyValue myVal; // declara uma referência de interface

		/**
		 * Aqui a expressão lambda é simplemenste uma expressão de constante. Quando ela
		 * é atribuida a myVal, pe construída a instância de uma classe em que a
		 * expressão lambda implementa o método getValue() de MyValue.
		 */
		myVal = () -> 98.6;

		/**
		 * Chama getValue(), que é fornecido pela expressão lambda atribuida
		 * anteriormente.
		 */
		System.out.println("A constrant value: " + myVal.getValue());

		MyParamValue myPval = (n) -> 1.0 / n;

		// Chama getValue() por intermédio da referência de myPval.
		System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
		System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

	}
}
