package EjercicioTema5_6;

public class Personas {
	
	private String nom;
	private String dni;
	private int edat;
	
	public Personas(String nom, String dni, int edat) {
		this.nom = nom;
		this.dni = dni;
		this.edat = edat;
	}
	
	public String getnom ()  {
		return nom;
	}
	
	public String getdni () {
		return dni;
	}
	
	public int getedat () {
		return edat;
	}
	
	public void mostrarDades() {
		System.out.println("Nom: "+nom);
		System.out.println("Dni: "+dni);
		System.out.println("Edat: "+edat);
	}
	
	

}
