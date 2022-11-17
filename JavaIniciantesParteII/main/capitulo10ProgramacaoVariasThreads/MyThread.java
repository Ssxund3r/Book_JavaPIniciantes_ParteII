package capitulo10ProgramacaoVariasThreads;

public class MyThread implements Runnable {
	Thread thrdName;
	static SumArray sa = new SumArray();
	int a[];
	int answer;

	public MyThread(String name, int nums[]) {
		thrdName = new Thread(this, name);
		thrdName.start();
		a = nums;
	}
	
	public MyThread(String name) {
		thrdName = new Thread(this, name);
		thrdName.start();
		
	}

	// Ponto de entrada da Thread.
	public void run() {
		System.out.println(thrdName.getName() + " starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName.getName() + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrdName.getName() + "Interrupted...");
		}
		System.out.println(thrdName.getName() + " terminating...");
	}
	
	public void runs() {
		int sum;
		System.out.println(thrdName.getName() + " starting");

		answer = sa.sumArray(a);
		System.out.println("Sum for" + thrdName.getName() + " is " + answer);

		System.out.println(thrdName.getName() + " terminating.");
	
	
 }
}