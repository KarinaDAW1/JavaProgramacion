package EjercicioTema5_6;

public class Alumne extends Personas{
	private String nivell;
	public Alumne(String nom, String dni, int edat, String nivell) {
		super(nom, dni, edat);
		this.nivell = nivell;
	}
	
	public String getnivell() {
		return nivell;
	}
	
	public void mostrarDades() {
		super.mostrarDades();
		System.out.println("Nivell: "+nivell);
	}

}
