package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.ContaCorrente;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public void roda(ContaCorrente c) {

		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Atualizado: " + c.getSaldo());

		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
