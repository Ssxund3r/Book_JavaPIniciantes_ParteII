package capitulo8pacotesInterfaces.bookpack;

public class ByTwosPrev implements Series{
	int start;
	int val;
	int prev;
	
	public ByTwosPrev() {
		start = 0;
		val = 0;
	}
	
	@Override
	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		val = start;
		prev = start - 2;
	}

	@Override
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x - 2;
	}
	
	public int getPrevious() { //Adiciona um método não definido em Series
		return prev;
	}
}
