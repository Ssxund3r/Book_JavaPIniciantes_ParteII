package capitulo10ProgramacaoVariasThreads;

public class UseThreads {
	public static void main(String[] args) {

		System.out.println("Main Thread stating...");

		// Primeiro contrói um objeto MyThread
		MyThread myThread = new MyThread("Child#1");

		// Em seguida contrói uma thread a patir desse objeto
		Thread thread = new Thread(myThread);

		// Para concluir, começa a execução da thread
		thread.start();

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interruped...");
			}
		}
		System.out.println("Main Thread ending...");
	}
}
