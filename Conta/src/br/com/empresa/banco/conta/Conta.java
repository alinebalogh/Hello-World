package br.com.empresa.banco.conta;

abstract class Conta {

	protected double saldo;

	/**
	 * realiza um deposito na conta dado um valor
	 * @param valor	valor a ser depositado
	 * @throws ValorInvalidoException caso o valor a ser depositado for menor que zero
	 */
	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	abstract void atualiza(double taxa);

}
