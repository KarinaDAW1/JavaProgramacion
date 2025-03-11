package Hotel;

public class Cliente {
	private String nombre;
	private String dni;
	private int numerotelefonico;
	private String correo;
	
	public Cliente(String nombre, String dni, int numerotelefonico, String correo) {
		this.nombre = nombre;
		this.dni = dni;
		this.numerotelefonico = numerotelefonico;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getNumerotelefonico() {
		return numerotelefonico;
	}

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", numerotelefonico=" + numerotelefonico + ", correo="
				+ correo + "]";
	}	
}
