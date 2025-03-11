package Hotel;

public abstract class Habitacion {
	private String numHab;
	private String tipo;
	private double PrecioPorNoche;
	
	public Habitacion(String numHab, String tipo, double precioPorNoche) {
		this.numHab = numHab;
		this.tipo = tipo;
		PrecioPorNoche = precioPorNoche;
	}

	public String getNumHab() {
		return numHab;
	}

	public String getTipo() {
		return tipo;
	}
	
	public double getPrecioPorNoche() {
		return PrecioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		PrecioPorNoche = precioPorNoche;
	}
	
	@Override
	public String toString() {
		return "Habitacion [ +"
				+ "Numero de habitación: "+numHab+ '\'' +
				", Tipo de habitación: "+tipo+'\''+
				", Precio por noche: "+PrecioPorNoche+'.';
	}
	
	public abstract void mostrarDetalles();
}
