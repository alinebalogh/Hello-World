package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100.0);
		System.out.printf("O saldo e: %.2f", conta.getSaldo());
	}
}
