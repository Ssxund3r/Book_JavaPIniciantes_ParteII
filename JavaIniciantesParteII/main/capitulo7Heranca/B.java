package capitulo7Heranca;

//Cria uma subclasse estendendo a classe A
public class B extends A {
	int i; // essa variável i oculta a variável i de A.

	B(int a, int b) {
		super.i = a; // i de A -> Aqui a variável super.i referencia a variável A
		i = b; // i de B
	}

	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}

}
