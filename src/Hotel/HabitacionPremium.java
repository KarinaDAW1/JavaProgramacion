package Hotel;

public class HabitacionPremium extends Habitacion {
	
	private boolean sauna;
	private int numCamas;
	
	public HabitacionPremium(String numHab, String tipo, double precioPorNoche, boolean sauna, int numCamas) {
		super(numHab, tipo, precioPorNoche);
		this.sauna = sauna;
		this.numCamas = numCamas;
	}
	
	public boolean sauna() {
		return sauna;
	}
    
	public int getNumCamas() {
		return numCamas;
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Esta es la habitación: "+getNumHab());
		System.out.println("De tipo: "+getTipo());
		System.out.println("Su precio por noche es de: "+getPrecioPorNoche());
		System.out.println("Tiene sauna: "+sauna());
		System.out.println("El numero de camas es: "+getNumCamas());
	}	
}
