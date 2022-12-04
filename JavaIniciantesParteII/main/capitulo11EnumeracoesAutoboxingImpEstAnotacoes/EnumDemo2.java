package capitulo11EnumeracoesAutoboxingImpEstAnotacoes;

public class EnumDemo2 {
	public static void main(String[] args) {
		Transport tp;
		
		System.out.println("Here are all Trnasport constants");
		
		//usa values()
		Transport allTransports[] = Transport.values();
		
		for (Transport t : allTransports) 
			System.out.println(t);
		
		System.out.println();
		
		//usa valueOf()
		tp = Transport.valueOf("AIRPLANE"); //obtém a constante de nome AIRPLANE
		System.out.println("tp constains " + tp);
	}
}
