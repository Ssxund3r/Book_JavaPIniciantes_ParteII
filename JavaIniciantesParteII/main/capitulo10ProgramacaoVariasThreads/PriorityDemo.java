package capitulo10ProgramacaoVariasThreads;

public class PriorityDemo {
	public static void main(String[] args) {

		Priority mt1 = new Priority("Hight Priority.");
		Priority mt2 = new Priority("Low Priority.");

		// Define as prioridades
		mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

		// Inicia Threads
		mt1.thread.start();
		mt2.thread.start();

		try {
			mt1.thread.join();
			mt2.thread.join();
		} catch (InterruptedException exc) {
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("\nHight priority thread counted to " + mt1.count);
		System.out.println("Low priority thread counted to " + mt2.count);
	}
}
