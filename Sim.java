
public class Sim {
	
	String numeroTelefono;
	String intestatario;
	double credito;
	int minutiDisponibili;
	int smsDisponibili;
	double costoMinuto;
	double costoSms;
	public Sim(String numeroTelefono, String intestatario, double credito, int minutiDisponibili, int smsDisponibili,
			double costoMinuto, double costoSms) {
		super();
		this.numeroTelefono = numeroTelefono;
		this.intestatario = intestatario;
		this.credito = credito;
		this.minutiDisponibili = minutiDisponibili;
		this.smsDisponibili = smsDisponibili;
		this.costoMinuto = costoMinuto;
		this.costoSms = costoSms;
	}
	@Override
	public String toString() {
		return "Sim [numeroTelefono=" + numeroTelefono + ", intestatario=" + intestatario + ", credito=" + credito
				+ ", minutiDisponibili=" + minutiDisponibili + ", smsDisponibili=" + smsDisponibili + ", costoMinuto="
				+ costoMinuto + ", costoSms=" + costoSms + "]";
	}

	
	public void ricarica(double importo) {
		
		if (importo >= 0) {
		
		this.credito += importo;}
		
		else {
			System.out.println("errore");
		}
	}
public void effettuaChiamata(int minuti) {
		
		if (this.minutiDisponibili >= minuti) {
		
		this.minutiDisponibili -= minuti;}
		
		else {
			if (this.minutiDisponibili > 0 && this.credito > 0) {
				
				
			int minutiResidui = this.minutiDisponibili;
			
			this.minutiDisponibili -= minutiResidui;
			
			int costoMinuti = 0;
			costoMinuti = minuti - minutiResidui;
			
			double costo = this.costoMinuto * costoMinuti;
			
			if (this.credito >= costo) {
				
				this.credito -= costo;
			}}
			
			else {
				
				System.out.println("Credito non sufficiente");
			}
			
		}
		
		
	}

/*
 * 
 * acquistaPacchettoMinuti(int minuti, double costo)

Se il credito è sufficiente, scala il costo dal credito e aggiunge minuti disponibili.

Altrimenti stampa “Credito insufficiente”.
 * 
 * 
 * 
 */
public void acquistaPacchettoMinuti(int minuti, double costo) {
	
	if (this.credito >= costo) {
		
		this.credito -= costo;
		this.minutiDisponibili += minuti;
	}
	
	else {
		
		System.out.println("Credito non sufficiente");
	}
		
		
	}
	
}



