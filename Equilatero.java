
public class Equilatero {
	
	
	
   double altezza;
   double base;
   
   
   
	
	

	public Equilatero(double altezza, double base) {
	super();
	this.altezza = altezza;
	this.base = base;
}
	
	
   





	@Override
	public String toString() {
		return "Equilatero [altezza=" + altezza + ", base=" + base + "]";
	}
	
	public double calcolaArea() {
		
		
		return this.altezza * this.base / 2;
	}
	
	public double calcolaPerimetro() {
		
		return this.base * 3;
		
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Equilatero t1 = new Equilatero(4, 5);
	System.out.println(t1.calcolaArea());
	System.out.println(t1.calcolaPerimetro());
	System.out.println(t1);

	}

}
