package capitulo7Heranca;
//Sobreposição de métodos
public class A {
	int i, j;
	
	A(int a, int b){
		i =a;
		j = b;
	}
	
	//exibe i e j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
	
}
