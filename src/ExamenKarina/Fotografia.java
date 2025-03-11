package ExamenKarina;

public class Fotografia extends ObraArte implements Exhibir, Vender, Restaurar {
	
	private String tipo;

	public Fotografia(String titulo, String autor, String creacion, String tipo) {
		super(titulo, autor, creacion);
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Fotografia [tipo=" + tipo + "]";
	}

	@Override
	public void SeRestaura() {
		System.out.println("Se puede restaurar");
		
	}

	@Override
	public void SeVende() {
		System.out.println("Se puede vender");
		
	}

	@Override
	public void SeExhibe() {
		System.out.println("Se puede exhibir");
		
	}
	
}
