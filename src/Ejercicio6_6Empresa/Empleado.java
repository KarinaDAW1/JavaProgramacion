package Ejercicio6_6Empresa;

public class Empleado extends Personas {
	private String sector;
	private int codigo;
	
	public Empleado(String nombre, String dni, int edat, String fecha_entrada, String fecha_sortida, String sector, int codigo) {
		super(nombre, dni, edat, fecha_entrada, fecha_sortida);
		this.sector = sector;
		this.codigo = codigo;
	}

	public String getsector () {
		return sector;
	}
	
	public int getcodigo () {
		return codigo;
	}
	
	public void mostrarInformacio () {
		System.out.println("Sector: "+sector);
		System.out.println("Codigo: "+codigo);
	}
}
