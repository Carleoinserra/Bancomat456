import java.util.Scanner;

public class firstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int operazione = input.nextInt();
		
		if (operazione > 4  || operazione < 0) {
			System.out.println("operazione non consentita");
		}
		else {
			 if (operazione == 1) {
				 
				 System.out.println(x + y);
			 }
			 if (operazione == 2) {
				 
				 System.out.println(x - y);
			 }
			 if (operazione == 3) {
				 System.out.println(x * y);
			 }
			 if (operazione == 4) {
				 
				 System.out.println(x / y);
				 System.out.println(x % y);
			 }
		}
		

	}

}
