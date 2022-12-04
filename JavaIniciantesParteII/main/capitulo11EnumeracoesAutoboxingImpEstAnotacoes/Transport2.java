package capitulo11EnumeracoesAutoboxingImpEstAnotacoes;

public enum Transport2 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	private int speed;
	
	//Construtor 
	private Transport2(int s) {
		this.speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
