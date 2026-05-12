import java.util.Scanner;

public class UsaConto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ContoCorrente c1 = new ContoCorrente(10000, "1234");
		System.out.println(c1);
		
		c1.preleva(2000 , "1235");
		System.out.println(c1);
		
		c1.preleva(10000 , "1234");
		
		c1.versa(4000 , "1234");
		c1.preleva(10000 , "1234");
		System.out.println(c1);
		int scelta = 0;
		
		do {
			System.out.println("1 per prelevare, 2 per versare, 0 per terminare, 3 per stampare");
			scelta = input.nextInt();
			
			if (scelta == 1) {
				
				System.out.println("Inserisci il pin ");
				String pin = input.next();
				
				System.out.println("Scrivi l'importo da prelevare: ");
				double importo = input.nextDouble();
				c1.preleva(importo, pin);
				
				
			}
          if (scelta == 2) {
				
				System.out.println("Inserisci il pin ");
				String pin = input.next();
				
				System.out.println("Scrivi l'importo da versare: ");
				double importo = input.nextDouble();
				c1.versa(importo, pin);
				
				
			}
          
          if (scelta == 3) {
        	  
        	  System.out.println(c1);
          }
			
			
			
		}
		
		while (scelta != 0);

	}

}
