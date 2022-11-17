package capitulo10ProgramacaoVariasThreads;

public class ThreadCom {
	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThreadThree mt1 = new MyThreadThree("Tick", tt);
		MyThreadThree mt2 = new MyThreadThree("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
			
		} catch (InterruptedException exc) {
			System.out.println("Main Thread interruped...");
		}
		
		
	}
}
