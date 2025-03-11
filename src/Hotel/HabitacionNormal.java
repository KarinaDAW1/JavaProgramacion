package Hotel;

public class HabitacionNormal extends Habitacion {
	
	private boolean balcon;
	private int numCamas;
	
	public HabitacionNormal(String numHab, String tipo, double precioPorNoche, boolean balcon, int numCamas) {
		super(numHab, tipo, precioPorNoche);
		this.balcon = balcon;
		this.numCamas = numCamas;
	}
	
	public boolean balcon() {
		return balcon;
	}
	
	public int getNumCamas() {
		return numCamas;
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println(toString()+"tiene balcon"+balcon);
		System.out.println("Tiene "+numCamas+" camas.");
	}	
}
