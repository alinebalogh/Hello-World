package br.com.empresa.banco;

public class TestaString {
	
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		
		/**
		 * trim:
		 * Verifica se existe espa�os nas pontas direita e esquerda
		 */
		
		String t = "  ttt";
		String tt = t.trim();
		System.out.println(t.length() + "  " + tt.length());

		/**
		 * isEmpty:
		 * Verifica se a string esta vazia
		 */
		
		System.out.println("A string � vazia?   " + t.isEmpty());
		
		String nomeCompleto = "Tiago Balogh";
		String sobrenome = "Balogh";
		
		System.out.println("Cont�m " + sobrenome +" ? " + nomeCompleto.contains(sobrenome));
		
		
		
	} 
}
