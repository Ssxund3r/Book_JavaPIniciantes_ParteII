package capitulo10ProgramacaoVariasThreads;

public class SumArray {
	private int sum;

	synchronized int sumArray(int nums[]) {

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for " + Thread.currentThread().getName() + " is" + sum);

			try {
				Thread.sleep(10); // Permite a alternância de tarefas
			} catch (InterruptedException exc) {
				System.out.println("Thread interruped.");
			}
		}
		return sum = 0;
	}
}
