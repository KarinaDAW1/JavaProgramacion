package ExamenKarina;

public class Escultura extends ObraArte implements Exhibir{
	
	private String material;
	
	public Escultura(String titulo, String autor, String creacion, String material) {
		super(titulo, autor, creacion);
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Escultura [material=" + material + "]";
	}

	@Override
	public void SeExhibe() {
		System.out.println("Se puede exhibir");
		
	}

	
	

}
