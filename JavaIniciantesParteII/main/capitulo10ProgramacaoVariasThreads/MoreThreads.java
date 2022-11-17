package capitulo10ProgramacaoVariasThreads;

public class MoreThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting. ");

		MyThread t1 = new MyThread("Child#1");
		MyThread t2 = new MyThread("Child#2");
		MyThread t3 = new MyThread("Child#3");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		while (t1.thrdName.isAlive() || t2.thrdName.isAlive() || t3.thrdName.isAlive());

		System.out.println("Main thread ending. ");
	}
}
