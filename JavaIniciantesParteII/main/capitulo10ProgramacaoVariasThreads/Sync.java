package capitulo10ProgramacaoVariasThreads;

public class Sync {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		MyThread m1 = new MyThread("My Child#1", a);
		MyThread m2 = new MyThread("My Child#2", a);

		try {
			m1.thrdName.join();
			m2.thrdName.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted..");
		}
	}
}
