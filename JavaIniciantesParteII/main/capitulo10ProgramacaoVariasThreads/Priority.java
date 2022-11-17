package capitulo10ProgramacaoVariasThreads;

//Demonstra as prioridades das threads 
public class Priority implements Runnable {
	int count;
	Thread thread;

	static boolean stop = false;
	static String currentName;

	/*
	 * Constrói uma nova thread. Observe que esse construtor não indica realmente a
	 * execução das threads.
	 */

	public Priority(String name) {
		thread = new Thread(this, name);
		count = 0;
		currentName = name;
	}

	// Começa a execução da nova Thread.
	@Override
	public void run() {
		System.out.println(thread.getName() + " stating.");
		do {
			count++;

			if (currentName.compareTo(thread.getName()) != 0) {
				currentName = thread.getName();
				System.out.println("In " + currentName);
			}
		} while (stop == false && count < 10000000);
		stop = true;

		System.out.println("\n" + thread.getName() + " terminating.");
	}
}
