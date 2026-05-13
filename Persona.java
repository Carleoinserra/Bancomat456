
public class Persona {
	
	
	String nome;
	String mansione;
	double stipendio;
	boolean smart;
	public Persona(String nome, String mansione, double stipendio) {
		super();
		this.nome = nome;
		this.mansione = mansione;
		this.stipendio = stipendio;
		this.smart = false;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", mansione=" + mansione + ", stipendio=" + stipendio + ", smart=" + smart
				+ "]";
	}


	public void bonus() {
		
		
		this.stipendio += 200;
	}
	
	public void setSmart() {
		
		if (this.smart == false) {
			
			
			this.smart = true;
		}
		
		else if (this.smart == true) {
			
			this.smart = false;
		}
		
		
	}
	

	
	
	
}
