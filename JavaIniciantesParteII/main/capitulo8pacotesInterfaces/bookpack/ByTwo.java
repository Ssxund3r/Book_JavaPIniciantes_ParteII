package capitulo8pacotesInterfaces.bookpack;

public class ByTwo implements Series{
	int start;
	int val;
	
	public ByTwo() {
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
	public void setStart(int x) {
		start = x;
		val = x;
		
	}
}
