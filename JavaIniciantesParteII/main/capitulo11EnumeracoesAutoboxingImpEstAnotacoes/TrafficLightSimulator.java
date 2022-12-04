package capitulo11EnumeracoesAutoboxingImpEstAnotacoes;

//Semaforo computadorizado
public class TrafficLightSimulator implements Runnable {
	private Thread thrd; // contém a thread que executta a simulação
	private TrafficLightColor tlc; // contém cor do sinal
	boolean stop = false; // configura com true para interromper a simulação
	boolean changed = false; // true quando o sinal mudou

	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}

	public TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;

		thrd = new Thread(this);
		thrd.start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000); // verde 10 segundos
					break;
				case YELLOW:
					Thread.sleep(2000); // Amarelo 2 segundos
					break;
				case RED:
					Thread.sleep(12000); // Vermelho 12 segundos
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}

	// Muda a cor
	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
		}

		changed = true;
		notify(); // Sinaliza que a cor mudou
	}

	// Espera até uma mudança de sinal ocorrer.
	synchronized void waitForChange() {
		try {
			while (!changed)
				wait(); // espera o sinal mudar
			changed = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

	// Retorna a cor atual
	synchronized TrafficLightColor getColor() {
		return tlc;
	}

	synchronized void cancel() {
		stop = true;
	}

}
