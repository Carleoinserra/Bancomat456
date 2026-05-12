import java.util.ArrayList;
import java.util.Scanner;

public class Liste {

	public static void main(String[] args) {
		
		//dicihiarato e importanto un arraylist di numeri interi
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		// con il metodo add andiamo ad aggiungere elementi nella lista
		/*lista.add(5);
		lista.add(6);
		lista.add(7);*/
		
		
		Persona p1 = new Persona("Bianchi" , "funzionario" , 3000);
		Persona p2 = new Persona("Rossi" , "operaio" , 1600);
		lista.add(p1);
		lista.add(p2);
	
		int scelta = 0;
		
		do {
			System.out.println("1 per aggiungere una persona 2 per stampare 3 per terminare: ");
			scelta = input.nextInt();
			
			if (scelta == 1) {
				
				System.out.println("Inserisci il nome: ");
				String nome = input.next();
				System.out.println("Inserisci la mansione: ");
				String mansione = input.next();
				System.out.println("Inserisci lo stipendio: ");
				int stipendio = input.nextInt();
				Persona p3 = new Persona(nome, mansione, stipendio);
				lista.add(p3);
				
			}
if (scelta == 2) {
				
				System.out.println(lista);
				
			}
			
			
		}
		
		while(scelta != 0);
		
		
		
		
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
