import java.util.Scanner;

public class variabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		double y = 4.5;
		String parola = "pippo";
		boolean ok = true;
		char car = 't';
		
		System.out.println(parola);
		
		Scanner input = new Scanner (System.in);
		System.out.println("Scrivi una parola: ");
		String parola1 = input.next();
		
		System.out.println(parola1);
		

	}

}
