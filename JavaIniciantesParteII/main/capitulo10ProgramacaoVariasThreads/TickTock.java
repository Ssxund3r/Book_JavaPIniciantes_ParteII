package capitulo10ProgramacaoVariasThreads;

//Usa wait() e notify() para similar um relógio funcionando 
public class TickTock {

	String state; // contém o estado do relogio

	synchronized void tick(boolean running) {
		if (!running) {
			state = "ticked";
			notify(); // notifica qualquer thread que estiver esperando
			return;
		}

		System.out.println("Tick");

		state = "ticked"; // define o estado atual com ticked

		notify(); // permite que Tock seja executado
		try {
			while (!state.equals("tocked"))
				wait(); // espera o tock terminar
		} catch (InterruptedException exc) {
			System.out.println("Thread interruped...");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) { //interrompe o relógio 
			state = "tocked";
			notify(); //notifica qualquer thread que estiver esperando
			return;
		}
		
		System.out.println("Tock");
		
		state = "tocked";
		
		notify();
		try {
			while(!state.equals("ticked"))
				wait();
		} catch (InterruptedException exc) {
			System.out.println("Thread Interruped...");
		} 
	}
}
