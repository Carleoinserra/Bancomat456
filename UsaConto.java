import java.util.Scanner;

public class UsaConto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ContoCorrente c1 = new ContoCorrente(10000, "1234");
		ContoCorrente c2 = new ContoCorrente(10000, "1235");
		
		
		int scelta = 0;
		Bancomat cc = new Bancomat();
		cc.aggiungiC(c2);
		cc.aggiungiC(c1);
		
		do {
			System.out.println("1 per prelevare, 2 per versare, 0 per terminare, 3 per stampare");
			scelta = input.nextInt();
			
			if (scelta == 1) {
				
				System.out.println("Inserisci il pin ");
				String pin = input.next();
				
				System.out.println("Scrivi l'importo da prelevare: ");
				double importo = input.nextDouble();
				cc.prelevaC(pin, importo);
				
				
			}
          if (scelta == 2) {
				
				System.out.println("Inserisci il pin ");
				String pin = input.next();
				
				System.out.println("Scrivi l'importo da versare: ");
				double importo = input.nextDouble();
				cc.versaC(pin, importo);
				
				
			}
          
          if (scelta == 3) {
        	  System.out.println("Inserisci il pin ");
				String pin = input.next();
        	  
        	 cc.mostraSaldo(pin);
          }
          if (scelta == 4) {

				System.out.println("Inserisci il pin ");
				String pin = input.next();
				
				System.out.println("Scrivi il saldo: ");
				double importo = input.nextDouble();
				cc.aggiungiC(new ContoCorrente(importo, pin));
				
        	  
        	  
          }
			
			
			
		}
		
		while (scelta != 0);

	}

}
