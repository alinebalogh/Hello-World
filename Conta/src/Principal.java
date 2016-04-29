
public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(100.0);
		System.out.printf("O saldo e: %.2f", conta.getSaldo());
	}
}
