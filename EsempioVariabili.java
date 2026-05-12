
public class EsempioVariabili {
	
	public static void main(String[] args) {
		
		
		// variabile di tipo intero uguale a 5
		
		int numInt = 5;
		
		int ris = 5 + 6;
		int ris1 = 5 * 6;
		int ris2 = 6 / 2;
		int ris3 = 6 % 5;
		/*String parola = "Il risultato della addizione è : " + ris;
		String parola1 = "Il risultato della addizione è : " + (ris + ris1);
		String parola2 = "i due risultati : " + ris  + " "  + ris1;
		System.out.println(ris3);
		System.out.println(parola2);
		System.out.print(ris + " " + ris1 + " ");
		System.out.print(ris2);*/
		
		
		Persona p1 = new Persona("Rossi", "Operaio", 2700);
		
		System.out.println(p1.nome);
		System.out.println(p1);
		
		
		
		
		
		
	}

}
