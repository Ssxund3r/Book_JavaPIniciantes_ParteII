package capitulo7Heranca;

//Cria uma subclasse estendendo a classe A
public class B extends A {
	int k;

	public B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show() {
		System.out.println("k: " + k);
	}

}
