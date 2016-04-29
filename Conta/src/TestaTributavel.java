
public class TestaTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(5000);
		System.out.println(cc.calculaTributos());
	
		Tributavel t  = cc;
		
		System.out.println(t.calculaTributos());
		
	}

}
