import java.util.ArrayList;

public class Bancomat {
	
	
	ArrayList<ContoCorrente> c1;
	
	public Bancomat() {
		
		
		c1 = new ArrayList<ContoCorrente>();
	}
	
	public void aggiungiC(ContoCorrente nuovoConto) {
	
			
			
				
				c1.add(nuovoConto);
				
			
			
		}
		
	public void prelevaC(String pin, double importo) {
		
		
		
		for (ContoCorrente cc: c1) {
			
			if (cc.pin.equals(pin)) {
				
				cc.preleva(importo, pin);
				
			}
			
		}}
public void versaC(String pin, double importo) {
		
		
		
		for (ContoCorrente cc: c1) {
			
			if (cc.pin.equals(pin)) {
				
				cc.versa(importo, pin);
				
			}
			
		}}

public void mostraSaldo(String pin) {
	for (ContoCorrente cc: c1) {
		
		if (cc.pin.equals(pin)) {
			
			System.out.println(cc);
			
		}
	
	
}
		
		
}}
		
	


