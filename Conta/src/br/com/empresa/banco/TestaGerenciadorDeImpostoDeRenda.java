package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SeguroVida;
import br.com.empresa.banco.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroVida sv = new SeguroVida();
		
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.deposita(50);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
	}	
}
