package EjercicioTema5_6;

public class Professor extends Personas {
	private String asignatura;
	public Professor(String nom, String dni, int edat, String asignatura) {
		super(nom, dni, edat);
		this.asignatura = asignatura;
	}
	public String getasignatura() {
		return asignatura;
	}
	
	public void mostrarDades() {
		super.mostrarDades();
		System.out.println("Asignatura: "+asignatura);
	}
	
	

}
