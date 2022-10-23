package capitulo8pacotesInterfaces.bookpack;

public class CircularQueue implements ICharQ {
	private char q[]; // esse array contém a fila
	private int putloc, getloc; // os índices put e get

	// Constrói uma fila vazia dado seu tamanho
	public CircularQueue(int size) {
		q = new char[size + 1]; // aloca memória para a fila
	}

	// Insere um caractere na fila
	@Override
	public void put(char ch) {
		/*
		 * A fila estará cheia se putloc for uma unidade menor do que getloc ou se
		 * putloc estiver no fim do array e getloc estiver no início.
		 */
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println(" - Queue is full! ");
			return;
		}
		q[putloc++] = ch;
		if (putloc == q.length)
			putloc = 0; // Retrocede
	}

	// remover um caractere da fila
	@Override
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty...");
			return (char) 0;
		}
		char ch = q[getloc++];
		if (getloc == q.length) //loop back
			getloc = 0;
		return ch;
	}
}
