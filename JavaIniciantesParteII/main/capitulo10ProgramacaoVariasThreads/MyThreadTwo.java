package capitulo10ProgramacaoVariasThreads;

public class MyThreadTwo extends Thread {

	public MyThreadTwo(String name) {
		super(name); // noemia a thread
		start(); // inicia a thread
	}

	// começa a execção de uma nova thread
	public void run() {
		System.out.println(getName() + " starting...");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is" + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + "Interrupted....");
		}
		System.out.println("Terminating");
	}
}
