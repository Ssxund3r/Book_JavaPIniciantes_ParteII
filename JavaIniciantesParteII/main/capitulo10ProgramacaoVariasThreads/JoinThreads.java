package capitulo10ProgramacaoVariasThreads;

public class JoinThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThread t1 = new MyThread("Child#1");
		MyThread t2 = new MyThread("Child#2");
		MyThread t3 = new MyThread("Child#3");
		
		try {
			t1.thrdName.join();
			System.out.println("Child #1 joined.");
			t2.thrdName.join();
			System.out.println("Child #2 joined. ");
			t3.thrdName.join();
			System.out.println("Child #3 joined. ");
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted...");
		}
		System.out.println("Main thread ending...");
	}
}
