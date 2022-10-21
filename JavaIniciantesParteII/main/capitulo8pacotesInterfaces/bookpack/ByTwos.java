package capitulo8pacotesInterfaces.bookpack;

public class ByTwos implements Series{
	int start;
	int val;
	
	public ByTwos() {
		start = 0;
		val = 0;
	}
	
	@Override
	public int getNext() {
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		val = start;
	}

	@Override
	public void setStar(int x) {
		start = x;
		val = x;
	}

}
