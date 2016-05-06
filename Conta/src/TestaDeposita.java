
public class TestaDeposita {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		try {
			cc.deposita(-100.0);
		} catch (IllegalArgumentException e) {
			System.out.println("Valor inválido");
		}
		
		
		
	}

}
