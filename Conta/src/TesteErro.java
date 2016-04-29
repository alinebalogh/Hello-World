
public class TesteErro {
	
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		// TODO Auto-generated method stub
		
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		// TODO Auto-generated method stub
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++){
			array[i] = i;
			System.out.println(i);
		}
			
		System.out.println("Fim do metodo 2");
		
	}
	

}


