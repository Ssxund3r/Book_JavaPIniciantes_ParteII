package capitulo12genericos;

/**
 * Classe generica simples. Aqui, T é um parâmetro de tipo que será substituído
 * pelo tipo real quando um objeto de tipo Gen for criado.
 */
public class Gen<T> {
	T ob; // declara um objeto de tipo T

	// Passa para o construtor uma referência a um objeto de tipo T
	public Gen(T o) {
		ob = o;
	}

	// Retorna ob.
	T getOb() {
		return ob;
	}

	// Exibe o tipo de T
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
