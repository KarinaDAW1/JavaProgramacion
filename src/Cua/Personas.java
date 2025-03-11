package Cua;

public class Personas {
	private String nom;
	private String dni;
	
	public Personas(String nom, String dni) {
		super();
		this.nom = nom;
		this.dni = dni;
	}
	
	 public String nom() {
	        return nom;
	    }

	    public String dni() {
	        return dni;
	    }
	
	public String toString() {
        return "Nombre = " + nom + ", DNI = " + dni + "\n";
    }
	
}
