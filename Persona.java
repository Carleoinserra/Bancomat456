
public class Persona {
	
	
	String nome;
	String mansione;
	double stipendio;
	public Persona(String nome, String mansione, double stipendio) {
		super();
		this.nome = nome;
		this.mansione = mansione;
		this.stipendio = stipendio;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", mansione=" + mansione + ", stipendio=" + stipendio + "]";
	}
	

	
	
	
}
