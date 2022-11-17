package capitulo10ProgramacaoVariasThreads;

public class MyThreadThree implements Runnable {
	Thread thrd;
	TickTock ttOb;

	// Constroi uma nova thread
	public MyThreadThree(String name, TickTock tickTock) {
		thrd = new Thread(this, name);
		ttOb = tickTock;
		thrd.start(); // Inicia uma nova thread
	}

	@Override
	public void run() {
		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++)
				ttOb.tick(true);
			ttOb.tick(false);
		} else {
			for (int i = 0; i < 5; i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}
