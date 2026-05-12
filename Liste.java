import java.util.ArrayList;
import java.util.Scanner;

public class Liste {

	public static void main(String[] args) {
		
		//dicihiarato e importanto un arraylist di numeri interi
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		// con il metodo add andiamo ad aggiungere elementi nella lista
		lista.add(5);
		lista.add(6);
		lista.add(7);
		
		
		Persona p1 = new Persona("Bianchi" , "funzionario" , 3000);
		System.out.println(p1);
		
		
		
		
		/*int scelta = 0;
		
		do {
			
			System.out.println("Inserisci un numero ");
			scelta = input.nextInt();
			
			if (scelta != 0) {
			
			lista.add(scelta);}
			
		}
		
		while (scelta != 0);
		
for (int i = 0; i < lista.size(); i++) {
	
	      
			
			System.out.println(lista.get(i));
			 if (lista.get(i) % 2 != 0) {
				 
				 System.out.println("E' dispari");
				
				
			}
			 else {
				 System.out.println("E' pari");
			 }
		}

	}*/
		
		

}}
