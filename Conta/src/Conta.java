
abstract class Conta {

	protected double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	abstract void atualiza(double taxa);

}
