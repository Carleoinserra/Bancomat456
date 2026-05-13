
public class ContoCorrente {
	
	public double saldo;
	public String pin;
	

	public ContoCorrente(double saldo, String pin) {
		super();
		this.saldo = saldo;
		this.pin = pin;
	}

	

	@Override
	public String toString() {
		return "ContoCorrente [saldo=" + saldo + "]";
	}
	
	
	public void preleva(double importo, String codice) {
		
		
		if (codice.equals(this.pin)) {
		
		
		if (this.saldo > importo) {
			
			this.saldo -= importo;
		}
		
		else {
			
			System.out.println("Credito non disponibile");
		}}
		
		else {
			System.out.println("Pin non riconosciuto");
		}
	}
public void versa(double importo , String codice) {
		
		
	if (codice.equals(this.pin)) {
			
			this.saldo += importo;
		
	}

	else {
		System.out.println("Pin non riconosciuto");
	}
		
	}

}
