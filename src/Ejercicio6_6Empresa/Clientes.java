package Ejercicio6_6Empresa;

public class Clientes extends Personas{
	private String producto;
	private String forma_pago;
	private double precio;
	public Clientes(String nombre, String dni, int edat, String fecha_entrada, String fecha_sortida, String producto2, String forma_pago2, Double precio2) {
		super(nombre, dni, edat, fecha_entrada, fecha_sortida);
		this.producto = producto;
		this.forma_pago = forma_pago;
		this.precio = precio;
	}
	
	public String producto() {
		return producto;
	}
	
	public String tarjeta() {
		return forma_pago;
	}
	
	public double precio() {
		return precio;
	}
	
	public void mostrarInformacio () {
		System.out.println("Producto: "+producto);
		System.out.println("Forma de pago: "+forma_pago);
		System.out.println("Precio. "+precio);
	}

}
