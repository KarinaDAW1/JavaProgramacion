package Ejercicio6_6Empresa;

public class Personas {
	private String nombre;
	private String dni;
	private int edat;
	private String fecha_entrada;
	private String fecha_sortida;
	
	public Personas(String nombre, String dni, int edat, String fecha_entrada, String fecha_sortida) {
		this.nombre = nombre;
		this.dni = dni;
		this.edat = edat;
		this.fecha_entrada = fecha_entrada;
		this.fecha_sortida = fecha_sortida;
	}
	
	public String getnombre () {
		return nombre;
	}
	
	public String getdni () {
		return dni;
	}
	
	public int edat () {
		return edat;
	}
	
	public String fecha_entrada () {
		return fecha_entrada;
	}
	
	public String fecha_sortida () {
		return fecha_sortida;
	}
	
	public void mostrarInformacio () {
		System.out.println("Nombre: "+nombre);
		System.out.println("Dni: "+dni);
		System.out.println("Edat: "+edat);
		System.out.println("Fecha Entrada: "+fecha_entrada);
		System.out.println("Fecha Sortida: "+fecha_sortida);
	}
	
	
	
}
