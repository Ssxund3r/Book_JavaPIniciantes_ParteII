package capitulo10ProgramacaoVariasThreads;

public class ExtendThread {
	public static void main(String[] args) {

		System.out.println("Main thread starting.");

		MyThread mt = new MyThread("Child#1");

		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(400);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted...");
			}
		}
		System.out.println("Main thread ending...");
	}
}
