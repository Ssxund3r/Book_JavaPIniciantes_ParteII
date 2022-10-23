package capitulo8pacotesInterfaces.bookpack;

public class FixedQueue implements ICharQ {
	private char q[]; // esse array contém fila
	private int putLoc, getLoc; // os indices put e get

	public FixedQueue(int size) {
		q = new char[size]; // aloca memória para fila
		putLoc = getLoc = 0;
	}

	@Override
	public void put(char ch) {
		if (putLoc == q.length) {
			System.out.println(" Queue is full! ");
			return;
		}
		q[putLoc] = ch;
	}

	// Remove um caractere da fila
	@Override
	public char get() {
		if (getLoc == putLoc) {
			System.out.println(" - Queue is empty! ");
			return (char) 0;
		}
		return q[getLoc++];
	}

}
